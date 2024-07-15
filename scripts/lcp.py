import argparse
import os
import json
from create_prompt_lcp import create_prompt
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat
from tqdm import tqdm

openai.api_key = os.getenv('OPENAIKEY')
AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=512

def find_path(dataset, pl):
    root = "../dataset"
    if dataset in ['CodeNet', 'Avatar']:
        data_path = os.path.join(root, dataset, f"{dataset}-{pl}")
        loop_path = os.path.join(root, 'Loops', f"{dataset}-{pl}_control.json")
    # elif dataset in ['humaneval']:
    #     data_path = "/home/changshu/LLM_REASONING/prompts/humaneval_notest"
    #     loop_path = os.path.join(root, 'Loops', f"{dataset}_control.json")
    else:
        data_path = os.path.join(root, dataset)
        loop_path = os.path.join(root, 'Loops', f"{dataset}_control.json")
    if not os.path.exists(data_path):
        print(f"{data_path} not found")
    if not os.path.exists(loop_path):
        print(f"{loop_path} not found")
    return data_path, loop_path


def annotate_code(code_path, loop_info, scratch_pad):
    comments = {}
    annotated_lines = []
    for k in loop_info:
        if scratch_pad:
            vars = []
            for var in loop_info[k]:
                vars.append(f'"{var}":??')
            new_text = ','.join(vars)
            new_text = " ## [STATE]{" + new_text + "}[/STATE]"
        else:
            new_text = ' ## '
            for var in loop_info[k]:
                new_text += f'[STATE]{var}=??[/STATE]'
        comments[k] = new_text
    with open(code_path, 'r') as file:
        for current_line, line in enumerate(file, start=1):
            if current_line in comments.keys():
                new_line = line.rstrip('\n') + comments[current_line] + '\n'
                annotated_lines.append(new_line)
            else:
                annotated_lines.append(line)
    return ''.join(annotated_lines)

def load_model(model_id, cache_dir):
    ## openai models:
    if 'gpt-' in model_id:
        return model_id, None
    ## huggingface models
    else:
        print(cache_dir)
        model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        tokenizer = AutoTokenizer.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        return model, tokenizer


def main(model_id, dataset, cache_dir, write_dir, task, pl, scratch_pad):
    json_path = "../model_config.json"
    data_path, loop_path = find_path(dataset, pl)
    loop_data = json.load(open(loop_path, 'r'))
    model_config = json.load(open(json_path, 'r'))

    model, tokenizer = load_model(model_id, cache_dir)
    api_type = model_config[model_id]["api"]
    code_ids = []
    if scratch_pad:
        if dataset in ['CodeNet', 'Avatar']:
            write_root = os.path.join(write_dir, task, 'scratch_pad',  model_id.split("/")[-1], f"{dataset}-{pl}")
        else:
            write_root = os.path.join(write_dir, task, 'scratch_pad', model_id.split("/")[-1], dataset)
    else:
        if dataset in ['CodeNet', 'Avatar']:
            write_root = os.path.join(write_dir, task, model_id.split("/")[-1], f"{dataset}-{pl}")
        else:
            write_root = os.path.join(write_dir, task, model_id.split("/")[-1], dataset)
    if not os.path.exists(write_root):
            os.makedirs(write_root)

    for k in loop_data.keys():
        # if len(loop_data[k]['For']) > 0:
        code_ids.append(k)
    for k in tqdm(code_ids):

        write_folder = os.path.join(write_root, k)
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        write_path = os.path.join(write_folder, 'response.txt')

        if os.path.exists(write_path):
            continue

        meta_data = {}
        for item in loop_data[k]:
            lineno = item['line_no']
            iterable = item['condition']
            meta_data[lineno] = iterable
        code_path = os.path.join(data_path, k, 'main.py')
        input_path = os.path.join(data_path, k, 'input.txt')
        code_input = open(input_path, 'r').read().strip('\n')
        new_code = annotate_code(code_path, meta_data, scratch_pad)
        # print(k)
        # print(new_code)
        prompt = create_prompt(model_id, new_code, code_input, dataset, pl, scratch_pad)

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
    parser.add_argument("--cache", type=str, default="/home/shared/huggingface")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results")
    parser.add_argument("--task", type=str, default="LCP")
    parser.add_argument("--pl", type=str, default="Python", help="select one from [Python, Java]")
    parser.add_argument("--scratch_pad", action="store_true")
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    task = args.task
    pl = args.pl
    scratch_pad = args.scratch_pad
    main(model_id, dataset, cache_dir, write_dir, task, pl, scratch_pad)