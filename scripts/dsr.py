import argparse
import os
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from tqdm import tqdm
from create_prompt_dsr import create_prompt
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat, generator_lllm, generator_vllm, generator_gemini
import json
from vllm import LLM
os.environ["CUDA_VISIBLE_DEVICES"] = "1,2"

AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=512
def find_path(dataset, pl):
    root = "../dataset/"
    if dataset in ["CodeNet", "Avatar"]:
        data_path = os.path.join(root, dataset, f"{dataset}-{pl}")
    else:
        data_path = os.path.join(root, dataset)
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
            model = LLM(model=model_id, max_model_len=35000, download_dir=cache_dir, tensor_parallel_size=2)
        else:
            model = LLM(model=model_id, download_dir=cache_dir, tensor_parallel_size=2)
        return model, None
    else:
        return model_id, None


def main(model_id, dataset, cache_dir, write_dir, task, pl):
    json_path = "../model_config.json"
    model_config = json.load(open(json_path, 'r'))
    api_type = model_config[model_id]["api"]
    root_dir = find_path(dataset, pl)


    if dataset in ['CodeNet', 'Avatar']:
        write_root = os.path.join(write_dir, 'Refactor_new', model_id.split("/")[-1], f"{dataset}-{pl}")
    else:
        write_root = os.path.join(write_dir, 'Refactor_new', model_id.split("/")[-1], dataset)
    if not os.path.exists(write_root):
        os.makedirs(write_root)


    model, tokenizer = load_model(model_id, cache_dir, api_type)
    for d in tqdm(os.listdir(root_dir)):
        if dataset == "humaneval" and "__" in d:
            continue

        write_folder = os.path.join(write_root, d)
        write_path = os.path.join(write_folder, 'raw_output.txt')
        # if os.path.exists(write_path):
        #     continue
        code_path = os.path.join(root_dir, d, 'transformation.py')
        tests_path = os.path.join(root_dir, d, "asserts.txt")
        
        if not os.path.exists(code_path) or not os.path.exists(tests_path):
            continue
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        code = open(code_path, 'r').read()
        tests = open(tests_path, 'r').read()
        
        method_signature = ""
        if dataset == "classeval":
            method_signature = d.split(".")[-1]
        
        prompt = create_prompt(dataset, model_id, code, tests, method_signature)
                
    
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
            if response:
                wr.write(response)
            else:
                wr.write(" ")



if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]")
    parser.add_argument("--cache", type=str, default="./cache")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument("--pl", type=str, default="Python", help="select one from [Python, Java]")
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    task = args.task
    pl = args.pl

    # print(use_test)
    # print(use_misleading_test)
    main(model_id, dataset, cache_dir, write_dir, task, pl)
    # find_path(dataset, pl)