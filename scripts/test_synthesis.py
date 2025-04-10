import os
import subprocess
import argparse
from tqdm import tqdm
from subprocess import Popen, PIPE

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

def test_avatar(test_folder, py_path):
    inputs_dir = os.path.join(test_folder, "all_tests", "input")
    outputs_dir = os.path.join(test_folder, "all_tests", "output")
    for d in os.listdir(inputs_dir):
        f_in = open(os.path.join(inputs_dir, d), 'r').read()
        f_out = open(os.path.join(outputs_dir, d.replace("input", "output")), 'r').read()
        p = Popen(['python3', py_path], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        try:
            stdout, stderr_data = p.communicate(input=f_in.encode(), timeout=20)
            try:
                if float(stdout.decode())%1 == 0:
                    stdout = str(int(float(stdout.decode())))
                    f_out = str(int(float(f_out)))
                else:
                    stdout_temp = stdout.decode().strip()
                    f_out_temp = f_out.strip()
                    f_out_total_dec_points = len(f_out_temp.split(".")[1])
                    stdout_total_dec_points = len(stdout_temp.split(".")[1])
                    min_dec_points = min(f_out_total_dec_points, stdout_total_dec_points)

                    stdout = str(round(float(stdout.decode()), min_dec_points))
                    f_out = str(round(float(f_out), min_dec_points))

            except:
                try:
                    stdout = stdout.decode()
                except:
                    pass
            if(stdout.strip()==f_out.strip()):
                pass
            else:
                return 0
        except:
            return 0
    return 1

    

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    parser.add_argument('--test_one', action='store_true')
    parser.add_argument('--refactor', action='store_true')
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    task = args.task
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    test_one = args.test_one
    refactor = args.refactor
    

    # if der:
    #     if use_test:
    #         root_dir = os.path.join(write_dir, 'DER', task, "use_test", model_id.split("/")[-1], dataset)
    #     elif use_misleading_test:
    #         root_dir = os.path.join(write_dir, 'DER', task, "misleading_test", model_id.split("/")[-1], dataset)
    #     else:
    #         root_dir = os.path.join(write_dir, 'DER', task, "no_test", model_id.split("/")[-1], dataset)
    # else:
    if use_test:
        root_dir = os.path.join(write_dir, 'SR', task, "use_test", model_id.split("/")[-1], dataset)
    elif use_misleading_test:
        root_dir = os.path.join(write_dir, 'SR', task, "misleading_test", model_id.split("/")[-1], dataset)
    else:
        root_dir = os.path.join(write_dir, 'SR', task, "no_test", model_id.split("/")[-1], dataset)
    
    wr_dir = os.path.join(write_dir, "result_stat", "SR")      
    
    if refactor:
        if dataset == "Avatar":
            root_dir = os.path.join(write_dir, 'Refactor_new', model_id.split("/")[-1], "Avatar-Python")
        else:
            root_dir = os.path.join(write_dir, 'Refactor_new', model_id.split("/")[-1], dataset)
        wr_dir = os.path.join(write_dir, "result_stat", "CR_new")
    total_samples = []
    pass_samples = []
    fail_samples = []
    test_summary = {}
    if dataset == "Avatar":
        data_root = "../dataset/Avatar/Avatar-Python"
    else:
        data_root = f"../dataset/Intermediate/Synthesis/{dataset}"
    
    for d in tqdm(os.listdir(root_dir)):
        if d.endswith(".txt"):
            continue
        total_samples.append(d)
        code_path = os.path.join(root_dir, d, 'main.py')
        path_ut = os.path.join(root_dir, d, 'main_underTest.py')
        if dataset == "humaneval":
            if test_one:
                assertion_path = os.path.join(data_root, d, 'assert.txt')
            else:
                assertion_path = os.path.join(data_root, d, 'asserts.txt')
            entry_path = os.path.join(data_root, d, 'entry_point.txt')
            
            if not os.path.exists(code_path) or not os.path.exists(assertion_path):
                continue
            code = open(code_path, 'r').read()
            assertion = open(assertion_path, 'r').read()
            entry_point = open(entry_path, 'r').read().strip()
            import_stmt = "from typing import *"
             
            code_ut = import_stmt + '\n' + code + '\n' + assertion
            
            if not test_one:
                code_ut = code_ut + "\n" + f"check({entry_point})"
        elif dataset == "cruxeval":
            assertion_path = f"../dataset/cruxeval/{d}/asserts.txt"
            assertion = open(assertion_path, 'r').read()
            code = open(code_path, 'r').read()
            code_ut = code + "\n" + assertion
        elif dataset == "Avatar":
            test_folder = os.path.join(data_root, d)
            test_result = test_avatar(test_folder, code_path)
        
        if dataset in ["cruxeval", "humaneval"]:
            with open(path_ut, 'w') as wr:
                wr.write(code_ut)
            
            
            test_result = test_python(path_ut)
            test_summary[d] = test_result

        if test_result:
            pass_samples.append(d)
        else:
            fail_samples.append(d)

    print("pass:"+ str(len(pass_samples)) + '\t' + "total:" + str(len(total_samples)) + '\t' + str(len(pass_samples)/len(total_samples)))

    
   
    log_path = os.path.join(root_dir, 'pass_id.txt')
    with open(log_path, 'w') as wrl:
        for i in pass_samples:
            wrl.write(i + '\n')
    # print(fail_samples)