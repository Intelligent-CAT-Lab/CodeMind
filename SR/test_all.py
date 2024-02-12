import os
import subprocess
from tqdm import tqdm
import json

def test_all(model, dataset):
    folder = f"/home/changshu/LLM_REASONING/synthesized_code/under_test/{dataset}/{model}"
    result = {}
    count = 0
    for d in tqdm(os.listdir(folder)):
        pycode = os.path.join(folder, d, 'main_all_asssertions.py')
        test_result_flag = 1
        try:
            test_result = subprocess.run(
            ['python', pycode],
            capture_output = True,
            text = True,
            timeout=10    
            )
            
            if test_result.stderr:
                test_result_flag = 0
        except:
            test_result_flag = 0
        count += test_result_flag
        result[d] = test_result_flag
    print(count)
    
    wr_path = f"/home/changshu/LLM_REASONING/synthesized_code/test_results/{dataset}/{model}/test_all_result.json"
    with open(wr_path, 'w', encoding='utf-8') as wr:
        json.dump(result, wr, indent=4)

def get_overleap(model, dataset):
    test_path = f"/home/changshu/LLM_REASONING/synthesized_code/test_results/{dataset}/{model}/test_all_result.json"
    reasoning_path = f"/home/changshu/LLM_REASONING/synthesized_code/under_test/property/{dataset}/{model}/reasoning_result_nocomments.json"
    count = 0
    with open(test_path, 'r') as f1, open(reasoning_path, 'r') as f2:
        test_data = json.load(f1)
        reasoning_data = json.load(f2)
        
        for k in test_data.keys():
            if test_data[k] == 1 and reasoning_data[k] == 1:
                count += 1
    print(count)

if __name__ == "__main__":
    # folder = "/home/changshu/LLM_REASONING/synthesized_code/under_test/MBPP/MagicCoder"
    # get_overleap("MagicCoder", "MBPP")
    # get_overleap("CodeLlama", "MBPP")
    # get_overleap("StarCoder", "MBPP")
    get_overleap("Mistral", "MBPP")
    # get_overleap("WizardCoder", "MBPP")
    # get_overleap("GPT_4", "MBPP")
    # test_all('GPT_4', 'MBPP')
    