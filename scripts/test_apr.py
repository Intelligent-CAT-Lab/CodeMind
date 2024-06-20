import os
import subprocess

def cleanup(result_root):
    root_dataset = "../dataset/Intermediate/Repair/HumanEvalFix"
    for d in os.listdir(result_root):
        response_path = os.path.join(result_root, d, 'response.txt')
        tests_path = os.path.join(root_dataset, d, 'tests.txt')
        ut_path = os.path.join(result_root, d, 'ut.py')
        response = open(response_path, 'r').read()
        fixed_code = response.split('```python')[-1].split("```")[0]
        test_cases = open(tests_path, 'r').read()
        code_ut = fixed_code +  '\n' + test_cases
        with open(ut_path, 'w', encoding='utf-8') as f:
            f.write(code_ut)

def test_python(py_path):
    test_result_flag = 1 ## pass
    try:
        test_result = subprocess.run(
        ['python', py_path],
        capture_output = True,
        text = True,
        timeout=100
        )
        
        if test_result.stderr:
            test_result_flag = 0
    except:
        test_result_flag = 0
    return test_result_flag

def test_code(result_root):
    # print('hello')
    pass_count, total_count = 0, 0
    for d in os.listdir(result_root):
        total_count += 1
        path_ut = os.path.join(result_root, d, 'ut.py')
        status = test_python(path_ut)
        if status:
            pass_count += 1
    print(pass_count, total_count, pass_count/total_count)


# result_root = "../Experiment_Results/APR/deepseek-coder-6.7b-instruct/HumanEvalFix"
# cleanup(result_root)
# test_code(result_root)