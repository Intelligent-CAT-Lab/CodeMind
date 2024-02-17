from constants import Dataset
import json
import jsonlines
from typing import Tuple
import os
import subprocess
from tqdm import tqdm
import sys
import argparse
# evaluate


class PythonExecutor:
    def __init__(self, model, dataset, outDir, ut_dir, tr_dir, pt_dir):
        config_path = f"./config/{model}.json"
        
        with open(config_path, 'r') as file:
            self.config  = json.load(file)
        self.model = model
        self.dataset = dataset
        self.outDir = outDir
        # self.ut_dir = ut_dir
        self.output_path = os.path.join(outDir, model, dataset)
        
        self.under_test_folder = os.path.join(ut_dir, dataset, model)
        self.test_result_folder = os.path.join(tr_dir, dataset, model)
        self.passed_result_folder = os.path.join(pt_dir, dataset, model)
        if not os.path.exists(self.test_result_folder):
            os.makedirs(self.test_result_folder)
        if not os.path.exists(self.passed_result_folder):
            os.makedirs(self.passed_result_folder)
        self.mutated = self.config["mutate"] if "mutate" in self.config else 0
        
    def evaluate(self):
        path_output = os.path.join(self.output_path, 'output.jsonl')
        path_test_result = os.path.join(self.test_result_folder, 'test_result.jsonl')
        if os.path.exists(path_test_result):
            pass
            # print("have tested")
            # return
        else:
            if not os.path.exists(self.test_result_folder):
                os.makedirs(self.test_result_folder)
        results = []
        tested_problems = []
        count = 0
        total = 0
        with open(path_output, 'r') as f:
            for item in tqdm(jsonlines.Reader(f)):
                total += 1
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
        print("pass:", count, "total:", total)
    
    def prepare_directory(self):
        path_test_result = os.path.join(self.test_result_folder, 'test_result.jsonl')
        with open(path_test_result, "r") as f:
            reader = jsonlines.Reader(f)
            for row in reader:
                if row["test_result"]:
                    write_folder = os.path.join(self.passed_result_folder, row["problem_name"])
                    if not os.path.exists(write_folder):
                        os.makedirs(write_folder)
                    with open(os.path.join(write_folder, 'main.py'), 'w') as wr:
                        wr.write(row["code_generated"])
                    with open(os.path.join(write_folder, 'input.txt'), 'w') as wr:
                        wr.write(row["input"])
                    with open(os.path.join(write_folder, 'output.txt'), 'w') as wr:
                        wr.write(row["output"])
    def __call__(self,data_dict) -> Tuple[str,bool]:
        raise NotImplementedError

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    # parser.add_argument("--dataDir", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none')
    parser.add_argument("--outDir", type=str, default='none')
    parser.add_argument("--underTestDir", type=str, default='none')
    parser.add_argument("--testResultDir", type=str, default='none')
    parser.add_argument("--passTestDir", type=str, default='none')
    
    args = parser.parse_args()
    
    model = args.model
    dataset = args.dataset
    # data_dir = args.dataDir
    out_dir = args.outDir
    ut_dir = args.underTestDir
    tr_dir = args.testResultDir
    pt_dir = args.passTestDir
    
    
    executor = PythonExecutor(model, dataset, out_dir, ut_dir, tr_dir, pt_dir)
    executor.evaluate()
    executor.prepare_directory()