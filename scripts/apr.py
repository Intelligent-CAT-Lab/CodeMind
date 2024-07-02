import argparse
import os
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from tqdm import tqdm
from create_prompt_apr import create_prompt
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat
import json

openai.api_key = os.getenv('OPENAIKEY')
AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=512
def find_path(dataset):
    root = "../dataset/Intermediate/Repair"
    data_path = os.path.join(root, dataset)
    if not os.path.exists(data_path):
        print(f'{data_path} not exists.')
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


    
def main(model_id, dataset, cache_dir, write_dir, with_tests):
    json_path = "../model_config.json"
    model_config = json.load(open(json_path, 'r'))
    api_type = model_config[model_id]["api"]
    root_dir = find_path(dataset)
    if with_tests:
        write_root = os.path.join(write_dir, 'APR', model_id.split("/")[-1], dataset+"-tests")
    else:
        write_root = os.path.join(write_dir, 'APR', model_id.split("/")[-1], dataset)
    if not os.path.exists(write_root):
        os.makedirs(write_root)
    model, tokenizer = load_model(model_id, cache_dir)
    for d in tqdm(os.listdir(root_dir)):

        write_folder = os.path.join(write_root, d)
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        write_path = os.path.join(write_folder, 'response.txt')
        if os.path.exists(write_path):
            continue

        buggy_path = os.path.join(root_dir, d, 'buggy.txt')
        entry_path = os.path.join(root_dir, d, 'entry.txt')
        tests_path = os.path.join(root_dir, d, 'tests.txt')
        if not os.path.exists(buggy_path):
            continue
        buggy_code = open(buggy_path, 'r').read().strip("\n")
        # nl = open(nl_path, 'r').read().strip("\n")
        entry_point = open(entry_path, 'r').read().strip('\n')
        tests = open(tests_path, 'r').read().strip('\n')

        if not with_tests:
            tests = ''
        prompt = create_prompt(model_id, buggy_code, entry_point, tests)
        if api_type=="openai":
            err_flg, response = chatgpt_generator(model_id, prompt)
            if err_flg:
                response = 'ERR: reaches maximum context length'
        if api_type == "huggingface":
            response = huggingface_generator((model, tokenizer), prompt, MAX_NEW_TOKEN)
        if api_type == "huggingface_chat":
            response = huggingface_generator_chat((model, tokenizer), prompt, MAX_NEW_TOKEN)
        

        with open(write_path, 'w') as wr:
            wr.write(response)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--cache", type=str, default="./cache")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results")
    parser.add_argument("--add_tests", action='store_true' )
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    with_tests = args.add_tests
    main(model_id, dataset, cache_dir, write_dir, with_tests)
    # find_path(dataset, pl)
