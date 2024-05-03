import os
import subprocess
from subprocess import Popen, PIPE
from tqdm import tqdm
def test_java_avatar(code_id, root_code):
    os.chdir(root_code)
    root_tests  = "/home/changshu/CodeMind/dataset/Avatar/Avatar-python"
    root_input = os.path.join(root_tests, code_id, "all_tests", "input")
    root_output = os.path.join(root_tests, code_id, "all_tests", "output")

    input_paths, output_paths = [], []
    for d in os.listdir(root_input):
        tid = d.split("_")[0]
        input_paths.append(os.path.join(root_input, f"{tid}_input.txt"))
        output_paths.append(os.path.join(root_output, f"{tid}_output.txt"))
    java_path = os.path.join(root_code, code_id+".java")
    class_path = os.path.join(root_code, code_id+".class")
    if not os.path.exists(class_path):
        ## compile the .java file
        try:
            subprocess.run("javac "+code_id+".java", check=True, capture_output=True, shell=True, timeout=30)
        except:
            return False
    
    pass_flag = True
    for ip, op in zip(input_paths, output_paths):
        with open(ip, 'r') as f, open(op, 'r') as h:
            f_in = f.read()
            f_out = h.read()
        p = Popen(['java', code_id], stdin=PIPE, stdout=PIPE, stderr=PIPE)
        try:
            stdout, stderr = p.communicate(input=f_in.encode(), timeout=20)
            
            if stdout.decode().strip("\n").strip() != f_out.strip("\n").strip():
                pass_flag=False
                break
        except:
            pass_flag = False
            break 
    return pass_flag

def test_all_java(root):
    root_log = "/home/changshu/CodeMind/dataset/Translation/test_all_log"
    code_ids = []
    pass_ids = []
    for d in tqdm(os.listdir(root)):
        code_ids.append(d)
        folder = os.path.join(root, d)
        status = test_java_avatar(d, folder)
        if status:
            pass_ids.append(d)
    print(len(pass_ids), len(code_ids), len(pass_ids)/len(code_ids))
    print(pass_ids)
    file_name = root.split("/")[-2] + "_" + root.split("/")[-1]
    log_path = os.path.join(root_log, file_name)
    with open(log_path, "w") as wr:
        for l in pass_ids:
            wr.write(l+'\n')

def test_python_avatar(code_id, root_code):
    os.chdir(root_code)
    root_tests  = "/home/changshu/CodeMind/dataset/Avatar/Avatar-java"
    root_input = os.path.join(root_tests, code_id, "all_tests", "input")
    root_output = os.path.join(root_tests, code_id, "all_tests", "output")

    input_paths, output_paths = [], []
    for d in os.listdir(root_input):
        tid = d.split("_")[0]
        input_paths.append(os.path.join(root_input, f"{tid}_input.txt"))
        output_paths.append(os.path.join(root_output, f"{tid}_output.txt"))
    # java_path = os.path.join(root_code, code_id+".java")
    # class_path = os.path.join(root_code, code_id+".class")
    # if not os.path.exists(class_path):
    #     ## compile the .java file
    #     subprocess.run("javac "+code_id+".java", check=True, capture_output=True, shell=True, timeout=30)
    
    pass_flag = True
    for ip, op in zip(input_paths, output_paths):
        with open(ip, 'r') as f, open(op, 'r') as h:
            f_in = f.read()
            f_out = h.read()
        p = Popen(['python', "main.py"], stdin=PIPE, stdout=PIPE, stderr=PIPE)
        try:
            stdout, stderr = p.communicate(input=f_in.encode(), timeout=20)
            if stdout.decode().strip("\n").strip() != f_out.strip("\n").strip():
                pass_flag=False
                break
        except:
            pass_flag = False
            break 
    return pass_flag

def test_all_python(root):
    root_log = "/home/changshu/CodeMind/dataset/Translation/test_all_log"
    code_ids = []
    pass_ids = []
    for d in tqdm(os.listdir(root)):
        code_ids.append(d)
        folder = os.path.join(root, d)
        status = test_python_avatar(d, folder)
        if status:
            pass_ids.append(d)
    print(len(pass_ids), len(code_ids), len(pass_ids)/len(code_ids))
    print(pass_ids)
    file_name = root.split("/")[-2] + "_" + root.split("/")[-1]
    log_path = os.path.join(root_log, file_name)
    with open(log_path, "w") as wr:
        for l in pass_ids:
            wr.write(l+'\n')
    


root = "/home/changshu/CodeMind/dataset/Translation/starcoder2/avatar_python_java"
# root = "/home/changshu/CodeMind/dataset/Translation/wizardcoder/avatar_python_java"
test_all_java(root)

root = "/home/changshu/CodeMind/dataset/Translation/starcoder2/avatar_java_python"
test_all_python(root)
root = "/home/changshu/CodeMind/dataset/Translation/mistral/avatar_java_python"
test_all_python(root)
root = "/home/changshu/CodeMind/dataset/Translation/mistral/avatar_python_java"
test_all_java(root)
# root = "/home/changshu/CodeMind/dataset/Translation/gpt-4/avatar_java_python"
# test_all_python(root)
# root = "/home/changshu/CodeMind/dataset/Translation/starcoder/avatar_java_python"
# test_all_python(root)
# root = "/home/changshu/CodeMind/dataset/Translation/wizardcoder/avatar_java_python"
# test_all_python(root)
# root = "/home/changshu/CodeMind/dataset/Translation/magicoder/avatar_java_python"
# test_all_python(root)

