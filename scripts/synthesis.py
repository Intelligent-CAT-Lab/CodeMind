import argparse
import os
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from tqdm import tqdm
from create_prompt_der import create_prompt
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat
import json

openai.api_key = os.getenv('OPENAIKEY')
AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=1024
def find_path(dataset, pl):
    root = "../dataset/Intermediate/Synthesis"
    
    data_path=os.path.join(root, dataset)
    if not os.path.exists(data_path):
        print(f'{dataset} does not exist')
    else:
        return data_path

def load_model(model_id, cache_dir):
    ## openai models:
    if 'gpt-' in model_id:
        return model_id, None
    ## huggingface models
    else:
        # print(cache_dir)
        model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        tokenizer = AutoTokenizer.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        return model, tokenizer


    
def main(model_id, dataset, cache_dir, write_dir, task, pl, use_test, use_misleading_test, der_flag):
    json_path = "../model_config.json"
    model_config = json.load(open(json_path, 'r'))
    api_type = model_config[model_id]["api"]
    root_dir = find_path(dataset, pl)
    if der_flag:
        if use_test:
            write_root = os.path.join(write_dir, 'DER', task, "use_test" , model_id.split("/")[-1], dataset)
        elif use_misleading_test:
            write_root = os.path.join(write_dir, 'DER', task, "misleading_test" , model_id.split("/")[-1], dataset)
        else:
            write_root = os.path.join(write_dir, 'DER', task, "no_test" , model_id.split("/")[-1], dataset)
    else:
        if use_test:
            write_root = os.path.join(write_dir, 'SR', task, "use_test" , model_id.split("/")[-1], dataset)
        elif use_misleading_test:
            write_root = os.path.join(write_dir, 'SR', task, "misleading_test" , model_id.split("/")[-1], dataset)
        else:
            write_root = os.path.join(write_dir, 'SR', task, "no_test" , model_id.split("/")[-1], dataset)        
    if not os.path.exists(write_root):
        os.makedirs(write_root)
    model, tokenizer = load_model(model_id, cache_dir)
    for d in tqdm(os.listdir(root_dir)):
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
            assert_path = os.path.join(root_dir, d, 'assert.txt')
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
        
        

        write_folder = os.path.join(write_root, d)
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        write_path = os.path.join(write_folder, 'raw_output.txt')
        with open(write_path, 'w') as wr:
            wr.write(response)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]")
    parser.add_argument("--cache", type=str, default="./cache")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/intermediate")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument("--pl", type=str, default="Python", help="select one from [Python, Java]")
    parser.add_argument('--use_test', help='use tests', action='store_true')
    parser.add_argument('--use_misleading_test', help='use misleading tests', action='store_true')
    parser.add_argument('--der', help='use misleading tests', action='store_true')
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    task = args.task
    pl = args.pl
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    der_flag = args.der
    # print(use_test)
    # print(use_misleading_test)
    main(model_id, dataset, cache_dir, write_dir, task, pl, use_test, use_misleading_test, der_flag)
    # find_path(dataset, pl)
