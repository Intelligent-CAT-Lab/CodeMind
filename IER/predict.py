import json
import os
from transformers import AutoModelForCausalLM, AutoTokenizer, BitsAndBytesConfig

import sys
from utils import Dataset, Model
sys.path.append("/home/changshu/LLM_REASONING/clean_up/IER/prompts")
## import generators
from generator import chatgpt_generator, huggingface_generator
## import prompts
from GPT import GPT_Java_CodeNet, GPT_Python_CodeNet, GPT_Python_MBPP
from MagicCoder import MagicCoder_Java_CodeNet, MagicCoder_Python_CodeNet, MagicCoder_Python_MBPP, MagicCoder_Python_CruxEval
from WizardCoder import WizardCoder_Java_CodeNet, WizardCoder_Python_CodeNet, WizardCoder_Python_MBPP, WizardCoder_Python_CruxEval
from CodeLlama import CodeLlama_Java_CodeNet, CodeLlama_Python_CodeNet, CodeLlama_Python_MBPP, CodeLlama_Python_CruxEval
from StarCoder import StarCoder_Java_CodeNet, StarCoder_Python_CodeNet, StarCoder_Python_MBPP, StarCoder_Python_CruxEval
from Mistral import Mistral_Java_CodeNet, Mistral_Python_CodeNet, Mistral_Python_MBPP, Mistral_Python_CruxEval
from DeepSeek import DeepSeek_Java_CodeNet, DeepSeek_Python_CodeNet, DeepSeek_Python_MBPP, DeepSeek_Python_CruxEval
from tqdm import tqdm



class CodeReasoningGenerator:
    def __init__(self, configFile):
        with open(configFile, 'r') as file:
            self.config = json.load(file)
        self.root_dir = self.config["root_dir"]
        self.file_name = self.config["file_name"]
        self.model = self.config["model"]
        self.dataset = self.config["dataset"]
    
    def read_code_input(self, folder):
        path_code = os.path.join(folder, self.file_name)
        path_input = os.path.join(folder, 'input.txt')
        if not os.path.exists(path_code) or not os.path.exists(path_input):
            return None, None
        code = open(path_code, 'r').read()
        code_input = open(path_input, 'r').read().replace("\n","")
        return code, code_input
    
    def save_output(self, p_id, output):
        save_folder = os.path.join(self.config.output_dir, self.config.model, p_id)
        if not os.path.exists(save_folder):
            os.makedirs(save_folder)
        output_path = os.path.join(save_folder, "raw_output.txt")
        with open(output_path, "w", encoding='utf-8') as wr:
            wr.write(output) 
        
    
    def load_model(self):
    # load huggingface model if needed
        api_type = self.config['type']
        if api_type == "huggingface":
            model_id = self.config["model_id"]
            cache_dir = self.config['chache_dir']
            use_token = self.config['use_auth_token']
            model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", token=use_token, cache_dir=cache_dir)
            tokenizer = AutoTokenizer.from_pretrained(model_id, use_auth_token=use_token, cache_dir=cache_dir)
            return (model, tokenizer)
        else:
            return None      
    
    def load_data(self):
        data_dict = {}
        for d in os.listdir(self.root_dir):
            folder = os.path.join(self.root_dir, d)
            code, code_input = self.read_code_input(folder)
            if code:
                data_dict[d] = {
                    'code': code,
                    'input': code_input
                }
        return data_dict
    
    def prompt_selector(self):
        prompts = [GPT_Java_CodeNet, GPT_Python_CodeNet, GPT_Python_MBPP, MagicCoder_Python_CruxEval,
                MagicCoder_Java_CodeNet, MagicCoder_Python_CodeNet, MagicCoder_Python_MBPP, MagicCoder_Python_CruxEval,
                WizardCoder_Java_CodeNet, WizardCoder_Python_CodeNet, WizardCoder_Python_MBPP, WizardCoder_Python_CruxEval,
                CodeLlama_Java_CodeNet, CodeLlama_Python_CodeNet, CodeLlama_Python_MBPP, CodeLlama_Python_CruxEval,
                StarCoder_Java_CodeNet, StarCoder_Python_CodeNet, StarCoder_Python_MBPP, StarCoder_Python_CruxEval.
                Mistral_Java_CodeNet, Mistral_Python_CodeNet, Mistral_Python_MBPP, Mistral_Python_CruxEval,
                DeepSeek_Java_CodeNet, DeepSeek_Python_CodeNet, DeepSeek_Python_MBPP, DeepSeek_Python_CruxEval
                ]
        
        
        for p in prompts:
            if Model(self.model) in p.models and Dataset(self.dataset) in p.datasets:
                return p.prompt_text
    
    def generate(self, data, prompt_template):
        model, tokenizer = self.load_model()
        for k in tqdm(data.keys()):
            code = data[k]["code"]
            code_input = data[k]["input"]
            prompt = prompt_template.replace("CODE_PLACEHOLDER", code).replace("INPUT_PLACEHOLDER", code_input)
            
            if Model(self.model) in [Model.GPT_3, Model.GPT_4]:
                err_flag, output = chatgpt_generator(self.model, prompt)
                if err_flag:
                    output = "Generation Err"
            else:
                output = huggingface_generator((model, tokenizer), prompt, self.config["max_new_tokens"])
            self.save_output(k, output)
        
    def run(self):
        prompt_template = self.prompt_selector()
        data = self.load_data()
        self.generate(data, prompt_template)
        
        


if __name__ == "__main__":
    path = sys.argv[1]
    reasoning_generator = CodeReasoningGenerator(path)
    reasoning_generator.run()