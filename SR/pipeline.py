
import sys
import os
import json
from constants import Dataset, Model, PromptType,PromptBuilder
from transformers import AutoModelForCausalLM, AutoTokenizer, BitsAndBytesConfig
from tqdm import tqdm
import jsonlines
from typing import Optional, Tuple
from util import chatgpt_wrapper
from mutator import gen_mutated_assertion
import argparse
class CodeGenerationPipeline:
    def __init__(self, model, data_dir, dataset, out_dir, mutate):
        config_path = f"./config/{model}.json"
        # print(os.path.abspath(config_path))
        with open(config_path, 'r') as file:
            self.config = json.load(file)
        self.root_dir = data_dir
        self.model_name = model
        self.dataset_name = dataset
        self.output_root = out_dir
        self.generation_config = self.config['generation_config']
        # self.include_test = self.config['include_test']
        self.mutate = mutate
        self.output_dir = os.path.join(self.output_root, self.model_name, self.dataset_name)
        self.prompt_builder = PromptBuilder(Model(self.model_name), Dataset(self.dataset_name))
        if not os.path.exists(self.output_dir):
            os.makedirs(self.output_dir, exist_ok=True)
        self.resume_file = os.path.join(self.output_dir, 'resume_state.txt')

    def run(self):
        if Model(self.model_name).is_huggingface():
            model = self.load_model()
        else:
            model = None
        for subfolder in tqdm(os.listdir(self.root_dir)):
            subdir = os.path.join(self.root_dir, subfolder)
            problem_name = os.path.basename(subdir)
            if not self._should_process(problem_name):
                continue
            nl, input_data, expected_output, assertion, signature = self._read_problem_files(subdir)
            if self.mutate and assertion:
                assertion_ = gen_mutated_assertion(assertion)

            
                formatted_prompt = self.format_prompt(nl, input_data, expected_output, assertion_, signature)
            else:
                mutate = False
                assertion_ = None
                formatted_prompt = self.format_prompt(nl, input_data, expected_output, assertion, signature)
            # print(formatted_prompt)
            format_correct = False
            # while not format_correct:
            #     print(formatted_prompt)
            generated_code = self.generate(formatted_prompt, model)
            # print(formatted_prompt)
            # print(generated_code)
                # format_correct = self.check_code_format(generated_code,signature)
            self._save_output(problem_name, generated_code,nl,input_data,expected_output, assertion, assertion_)
            self._update_resume_state(problem_name)
    def check_code_format(self, generated_code, signature):
        print(generated_code)
        if signature:
            return signature in generated_code
        else:
            return True
        
        

    def format_prompt(self, nl, input_data, expected_output, assertion, signature):
        return self.prompt_builder._generate_base_prompt().create(nl, input_data, expected_output, assertion, signature)

    def load_model(self):
        '''load the huggingface model if needed. Only load for once'''
        api_type = self.config['generation_config']["type"]
        if api_type == "huggingface":
            model_id = self.config['generation_config']["model_id"]
            cache_dir = self.config['generation_config']['chache_dir']
            use_token = self.config['generation_config']['use_auth_token']
            
            model = AutoModelForCausalLM.from_pretrained(model_id, device_map="auto", token=use_token, cache_dir=cache_dir)
            tokenizer = AutoTokenizer.from_pretrained(model_id, use_auth_token=use_token, cache_dir=cache_dir)
            return (model, tokenizer)
        else:
            return None
            
    def generate(self, prompt, model:Optional[Tuple]):
        api_type = self.config['generation_config']["type"]
        if api_type == "huggingface":
            return self._generate_huggingface(prompt, model)
        else:
            return self._generate_openai(prompt)
            
    def _generate_openai(self, prompt):
        err_flag, result = chatgpt_wrapper(
            self.model_name,
            prompt,
            self.config['generation_config']['temperature'],
            self.config['generation_config']['max_new_tokens']
        )
        if err_flag:
            return "Generation Error"
        return result
    def _generate_huggingface(self, prompt, model):
        device = "cuda:0"
        hf_model, hf_tokenizer = model
        model_inputs = hf_tokenizer([prompt], return_tensors="pt").to(device)
        generated_ids = hf_model.generate(**model_inputs, max_new_tokens=self.config['generation_config']["max_new_tokens"])
        generated_code = hf_tokenizer.batch_decode(generated_ids)[0]
        return generated_code

    def _read_problem_files(self, subdir):
        with open(os.path.join(subdir, 'nl.txt'), 'r') as file:
            nl = file.read()
        if os.path.exists(os.path.join(subdir, 'input.txt')) and os.path.exists(os.path.join(subdir, 'output.txt'))\
            and os.path.exists(os.path.join(subdir, 'assert.txt')):
            with open(os.path.join(subdir, 'input.txt'), 'r') as file:
                input_data = file.read()
            with open(os.path.join(subdir, 'output.txt'), 'r') as file:
                expected_output = file.read()
            with open(os.path.join(subdir, "assert.txt"), 'r') as file:
                assertion = file.read()
        else:
            input_data = None
            expected_output = None
            assertion  = None
        if os.path.exists(os.path.join(subdir, 'signature.txt')):
            with open(os.path.join(subdir, 'signature.txt'),'r') as file:
                signature = file.read()
        else:
            signature = None
        return nl, input_data, expected_output, assertion, signature

    def _save_output(self, problem_name, generated_code,nl,input_data,expected_output, assertion, assertion_):
        with jsonlines.open(os.path.join(self.output_dir, 'output.jsonl'), 'a') as writer:
            writer.write({'problem_name': problem_name, 'generated_code': generated_code,
                          'model_name': self.model_name, 'dataset_name': self.dataset_name,
                          'nl':nl,'input_data':input_data,'expected_output':expected_output,
                          'assertion': assertion, 'assertion_': assertion_
                          })

    def _update_resume_state(self, problem_name):
        with open(self.resume_file, 'a') as file:
            file.write(problem_name + '\n')

    def _should_process(self, problem_name):
        if not os.path.exists(self.resume_file):
            return True
        with open(self.resume_file, 'r') as file:
            # load all the problems that have been processed
            processed_problems = file.readlines()
            processed_problems = [p.strip("\n") for p in processed_problems]
        if problem_name in processed_problems:
            return False
        else:
            return True
        
        

# # Example usage
# config_file = '/home/changshu/LLM_REASONING/pipeline/config/humaneval_GPT4.json'
# pipeline = CodeGenerationPipeline(config_file)
# pipeline.run()

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataDir", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none')
    parser.add_argument("--outDir", type=str, default='none')
    parser.add_argument("--mutate", type=int, default=0)

    args = parser.parse_args()
    
    model = args.model
    dataset = args.dataset
    data_dir = args.dataDir
    out_dir = args.outDir
    mutate = args.mutate
    
    pipeline = CodeGenerationPipeline(model, data_dir, dataset, out_dir, mutate)
    pipeline.run()