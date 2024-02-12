from constants import Dataset
import json
import jsonlines
from typing import Tuple
import os
import subprocess
from tqdm import tqdm
import sys
# evaluate

class Executor:
    def __init__(self, config_file):
        with open(config_file, 'r') as file:
            self.config  = json.load(file)
        self.dataset = self.config["dataset_name"]
        self.output_path = os.path.join(self.config["output_directory"], self.config["model_name"], self.config["dataset_name"])
        
        self.under_test_folder = os.path.join(self.config["under_test_directory"], self.config["dataset_name"], self.config["model_name"])
        self.test_result_folder = os.path.join(self.config["test_result_directory"], self.config["dataset_name"], self.config["model_name"])
        self.passed_result_folder = os.path.join(self.config["passed_test_directory"], self.config["dataset_name"], self.config["model_name"])
        self.mutated = self.config["mutate"] if "mutate" in self.config else 0
    def run(cls):
        executor = cls.get_executor(cls.dataset)
        executor.evaluate()
        executor.prepare_directory()
    @classmethod
    def get_executor(cls,dataset):
        if dataset == "MBPP":
            return MBPPExecutor(config_file)
        elif dataset == "HumanEval":
            return MBPPExecutor(config_file)
        elif dataset == 'HumanEvalNoTest':
            return MBPPExecutor(config_file)
        elif dataset == "MBPPNoTest":
            return MBPPExecutor(config_file)
        else:
            raise NotImplementedError
    
    def prepare_directory(cls):
        path_test_result = os.path.join(cls.test_result_folder, 'test_result.jsonl')
        with open(path_test_result, "r") as f:
            reader = jsonlines.Reader(f)
            for row in reader:
                if row["test_result"]:
                    write_folder = os.path.join(cls.passed_result_folder, row["problem_name"])
                    if not os.path.exists(write_folder):
                        os.makedirs(write_folder)
                    with open(os.path.join(write_folder, 'main.py'), 'w') as wr:
                        wr.write(row["code_generated"])
                    with open(os.path.join(write_folder, 'input.txt'), 'w') as wr:
                        wr.write(row["input"])
                    with open(os.path.join(write_folder, 'output.txt'), 'w') as wr:
                        wr.write(row["output"])
        
class MBPPExecutor(Executor):
    def evaluate(self):
        path_output = os.path.join(self.output_path, 'output.jsonl')
        path_test_result = os.path.join(self.test_result_folder, 'test_result.jsonl')
        if os.path.exists(path_test_result):
    
            print("have tested")
            return
        else:
            if not os.path.exists(self.test_result_folder):
                os.makedirs(self.test_result_folder)
        results = []
        tested_problems = []
        count = 0
        with open(path_output, 'r') as f:
            for item in tqdm(jsonlines.Reader(f)):
                test_result_flag = 1
                code_id = item["problem_name"]
                if code_id in tested_problems:
                    continue
                code_undertest_path = os.path.join(self.under_test_folder, code_id, 'main_under_test.py')
                if not os.path.exists(code_undertest_path):
                    continue
                try:
                    test_result = subprocess.run(
                    ['python', code_undertest_path],
                    capture_output = True,
                    text = True,
                    timeout=10    
                    )
                    
                    if test_result.stderr:
                        test_result_flag = 0
                except:
                    test_result_flag = 0
                code_generated = open(os.path.join(self.under_test_folder, code_id, 'main.py'), 'r').read()
                result_dict = {
                    'problem_name': code_id,
                    'code_generated': code_generated,
                    'input': item["input_data"],
                    'output': item["expected_output"],
                    'test_result':test_result_flag
                }
                
                if code_id not in tested_problems:
                    count += test_result_flag
                    results.append(result_dict)
                    tested_problems.append(code_id)
        with jsonlines.open(path_test_result, 'w') as wr_file:
            for r in results:
                jsonlines.Writer.write(wr_file, r)
        print(count)
    def __call__(self,data_dict) -> Tuple[str,bool]:
        raise NotImplementedError
class HumanEvalExecutor(Executor):
    def __call__(self,data_dict) -> Tuple[str,bool]:
        raise NotImplementedError

if __name__ == "__main__":
    config_file = sys.argv[1]
    executor = Executor(config_file)
    executor.run()


        
        
            
        
        
        
        
        