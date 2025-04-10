import argparse
import os
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from tqdm import tqdm
from create_prompt_der import create_prompt
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat, generator_lllm, generator_vllm, generator_gemini
import json
from vllm import LLM

AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=1024
def find_path(dataset, pl):
    root = "../dataset/Intermediate/Synthesis"

    data_path=os.path.join(root, dataset)
    if not os.path.exists(data_path):
        print(f'{dataset} does not exist')
    else:
        return data_path

def load_model(model_id, cache_dir, api_type):
    ## huggingface models
    if api_type == 'huggingface':
        # print(cache_dir)
        model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        tokenizer = AutoTokenizer.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        return model, tokenizer
    elif api_type == "vllm":
        if "deepseek-coder-33b" in model_id:
            model = LLM(model=model_id, max_model_len=35000)
        else:
            model = LLM(model=model_id)
        return model, None
    else:
        return model_id, None


def main(model_id, dataset, cache_dir, write_dir, task, pl, use_test, use_misleading_test):
    json_path = "../model_config.json"
    model_config = json.load(open(json_path, 'r'))
    api_type = model_config[model_id]["api"]
    root_dir = find_path(dataset, pl)


    if use_test:
        write_root = os.path.join(write_dir, task, "use_test" , model_id.split("/")[-1], dataset)
    elif use_misleading_test:
        write_root = os.path.join(write_dir, task, "misleading_test" , model_id.split("/")[-1], dataset)
    else:
        write_root = os.path.join(write_dir, task, "no_test" , model_id.split("/")[-1], dataset)        
    if not os.path.exists(write_root):
        os.makedirs(write_root)


    model, tokenizer = load_model(model_id, cache_dir, api_type)
    for d in tqdm(os.listdir(root_dir)):
        write_folder = os.path.join(write_root, d)
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        write_path = os.path.join(write_folder, 'raw_output.txt')
        if os.path.exists(write_path):
            continue
        nl_path = os.path.join(root_dir, d, 'nl.txt')
        if not os.path.exists(nl_path):
            continue
        nl = open(nl_path, 'r').read().strip("\n")
        signature_path = os.path.join(root_dir, d, 'signature.txt')
        if os.path.exists(signature_path):
            ## mbpp
            signature = open(signature_path, 'r').read()
        else:
            signature = "" ## signature in humaneval has been included in the nl description
        if use_test:
            assert_path = os.path.join(root_dir, d, 'asserts.txt')
            test_assert = open(assert_path, 'r').read().strip("\n")
        else:
            test_assert = ""

        prompt = create_prompt(model_id, nl, signature, test_assert)
        if api_type=="openai":
            err_flg, response = chatgpt_generator(model_id, prompt)
            if err_flg:
                response = 'ERR: reaches maximum context length'
        if api_type == "huggingface":
            response = huggingface_generator((model, tokenizer), prompt, MAX_NEW_TOKEN)
        if api_type == "huggingface_chat":
            response = huggingface_generator_chat((model, tokenizer), prompt, MAX_NEW_TOKEN)
        if api_type == "vllm":
            response = generator_vllm(model, prompt, MAX_NEW_TOKEN)
        if api_type == "litellm":
            response = generator_lllm(model, prompt)
        if api_type == "gai":
           response = generator_gemini(model_id, prompt) 
        with open(write_path, 'w') as wr:
            wr.write(response)

        with open(write_path, 'w') as wr:
            wr.write(response)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]")
    parser.add_argument("--cache", type=str, default="./cache")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/SR")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument("--pl", type=str, default="Python", help="select one from [Python, Java]")
    parser.add_argument('--use_test', help='use tests', action='store_true')
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    task = args.task
    pl = args.pl
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    # print(use_test)
    # print(use_misleading_test)
    main(model_id, dataset, cache_dir, write_dir, task, pl, use_test, use_misleading_test)
    # find_path(dataset, pl)
