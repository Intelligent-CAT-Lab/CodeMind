import argparse
import os
from transformers import AutoModelForCausalLM, AutoTokenizer
import openai
from tqdm import tqdm
from create_prompt import create_prompt
from prompt import chatgpt_generator, huggingface_generator, huggingface_generator_chat

openai.api_key = os.getenv('OPENAI_API_KEY')
AUTH_TOKEN = os.getenv('AUTH_TOKEN')
MAX_NEW_TOKEN=1024
def find_path(dataset):
    root = "../dataset"
    data_path = ""
    if dataset == 'codenet_java':
        data_path = os.path.join(root, 'CodeNet', 'CodeNet-Java')
    elif dataset == 'codenet_python':
        data_path = os.path.join(root, 'CodeNet', 'CodeNet-Python')
    elif dataset == 'avatar_java':
        data_path = os.path.join(root, 'Avatar', 'Avatar-java')
    elif dataset == 'avatar_python':
        data_path = os.path.join(root, 'Avatar', 'Avatar-python')
    elif dataset == 'cruxeval':
        data_path = os.path.join(root, 'cruxeval')
    elif dataset == 'humaneval':
        data_path = os.path.join(root, 'humaneval')
    elif dataset == 'mbpp':
        data_path = os.path.join(root, 'mbpp')
    ## check if the path exsits
    if not os.path.exists(data_path):
        print(f'{dataset} does not exist')
    else:
        return data_path

def load_model(model_id, cache_dir):
    ## openai models:
    if 'gpt-3.5' in model_id or 'gpt-4' in model_id:
        return model_id, None
    ## huggingface models
    else:
        # print(cache_dir)
        model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        tokenizer = AutoTokenizer.from_pretrained(model_id, device_map="auto", use_auth_token=AUTH_TOKEN, cache_dir=cache_dir)
        return model, tokenizer


    
def main(model_id, dataset, cache_dir, write_dir, task):
    root_dir = find_path(dataset)
    write_root = os.path.join(write_dir,model_id.split("/")[-1], task, dataset)
    if not os.path.exists(write_root):
        os.makedirs(write_root)
    model, tokenizer = load_model(model_id, cache_dir)
    for d in tqdm(os.listdir(root_dir)):
        if dataset in ['codenet_java', 'avatar_java']:
            ##  read java files
            code_path = os.path.join(root_dir, d, 'Main.java')
        else:
            code_path = os.path.join(root_dir, d, 'main.py')
        input_path = os.path.join(root_dir, d, 'input.txt')
        if not os.path.exists(code_path) or not os.path.exists(input_path):
            continue
        code = open(code_path, 'r').read().strip("\n")
        code_input = open(input_path, 'r').read().strip("\n")
        prompt = create_prompt(model_id, code, code_input, dataset)
        if 'gpt-3.5' in model_id or 'gpt-4' in model_id:
            err_flg, response = chatgpt_generator(model_id, prompt)
            if err_flg:
                response = 'ERR: reaches maximum context length'
        if 'Magicoder' in model_id or "CodeLlama" in model_id or "Llama2" in model_id or "Mistral" in model_id or "deepseek-coder" in model_id or "starcoder" in model_id or "WizardCoder" in model_id:
            response = huggingface_generator((model, tokenizer), prompt, MAX_NEW_TOKEN)
        if 'CodeQwen' in model_id:
            response = huggingface_generator_chat((model, tokenizer), prompt, MAX_NEW_TOKEN)
        
        

        write_folder = os.path.join(write_root, d)
        if not os.path.exists(write_folder):
            os.mkdir(write_folder)
        write_path = os.path.join(write_folder, 'response.txt')
        with open(write_path, 'w') as wr:
            wr.write(response)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]")
    parser.add_argument("--cache", type=str, default="./cache")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results")
    parser.add_argument("--task", type=str, default="IER")
    args = parser.parse_args()

    model_id = args.model
    dataset = args.dataset
    cache_dir = args.cache
    write_dir = args.writePath
    task = args.task
    main(model_id, dataset, cache_dir, write_dir, task)
