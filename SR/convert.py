import jsonlines
import os
import json
import sys

def parse_code(jsonl_path, mid_token, code_start_token, code_end_token, dataset_path, dataset_name, write_root):
    if  "mutate" in jsonl_path:
        write_root = f"{write_root}/mutate"
        write_folder = os.path.join(write_root, jsonl_path.split("/")[-3])
        write_subfolder = os.path.join(write_folder, jsonl_path.split("/")[-4])
    else:
        write_folder = os.path.join(write_root, jsonl_path.split("/")[-2])
        write_subfolder = os.path.join(write_folder, jsonl_path.split("/")[-3])
    
    if not os.path.exists(write_folder):
        os.mkdir(write_folder)
    if not os.path.exists(write_subfolder):
        os.mkdir(write_subfolder)
    
    # test_data = load_tests(dataset_path, dataset_name)
    
    
    with open(jsonl_path, 'r') as f:
        for item in jsonlines.Reader(f):
            
            code_id = item["problem_name"]
            output = item["generated_code"]
            try:
                if mid_token:
                    raw_code = output.split(mid_token)[1].split(code_start_token)[1].split(code_end_token)[0]
                else:
                    raw_code = output.split(code_start_token)[1].split(code_end_token)[0]
            except:
                print(code_id)
                continue
            ## get ride of the assertion
            screened_lines = [
                "from typing import *\n"
            ]
            lines = raw_code.split('\n')
            for line in lines:
                if line.startswith('assert') or line.startswith("#") or line.startswith("print"):
                    continue
                screened_lines.append(line)
            code = '\n'.join(screened_lines)
            
            if item["assertion"]:
                code_with_test = code + "\n" + item["assertion"]
            else:
                print(item)
                continue
            code_folder = os.path.join(write_subfolder, code_id)
            path_code = os.path.join(code_folder, 'main.py')
            path_code_with_test = os.path.join(code_folder, 'main_under_test.py')
            if not os.path.exists(code_folder):
                os.makedirs(code_folder)
            with open(path_code, 'w') as wr:
                wr.write(code)
            
            with open(path_code_with_test, 'w') as wr:
                wr.write(code_with_test)

if __name__ == "__main__":
    config_path = sys.argv[1]
    with open(config_path, 'r', encoding='utf-8') as readFile:
        config = json.load(readFile)
    
    sep_token = config["generation_config"]["sep_token"]
    code_start_token = config["generation_config"]["code_start_token"]
    code_end_token = config["generation_config"]["code_end_token"]
    
    jsonl_path = os.path.join(config["output_directory"], config["model_name"], config["dataset_name"], "output.jsonl")
    dataset_path = config["dataset_path"]
    dataset_name = config["dataset_name"]
    write_folder = config["under_test_directory"]
    
    parse_code(jsonl_path=jsonl_path, 
               mid_token=sep_token, 
               code_start_token=code_start_token, 
               code_end_token=code_end_token,
               dataset_path=dataset_path,
               dataset_name = dataset_name,
               write_root = write_folder
               )
