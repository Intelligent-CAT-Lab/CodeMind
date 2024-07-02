from utils import extract_methods_java
import os
import subprocess
from tqdm import tqdm

def rewrite_java(code_path):
    api_dict = extract_methods_java(code_path)
    new_lines = []
    with open(code_path, 'r') as file:
        for current_line, line in enumerate(file, start=0):
            new_lines.append(line)
            if current_line in api_dict.keys():
                for api in api_dict[current_line]:
                    if api[0]!='None':
                        name_to_print = api[0]
                    else:
                        name_to_print = api[1]
                    api_name = api[1].replace('"',"'")
                    new_line = f'System.out.println("[INST]{current_line};{api[0]};{api_name};"+{name_to_print});\n'
                    new_lines.append(new_line)
    new_code = ''.join(new_lines)
    
    write_folder = os.path.join('/'.join(code_path.split("/")[:-1]), 'tmp')
    if not os.path.exists(write_folder):
        os.makedirs(write_folder)
    write_path = os.path.join(write_folder, 'Main.java')
    with open(write_path, 'w') as wr:
        wr.write(new_code)

def run_all_java(root):
    for d in os.listdir(root):
        code_path = os.path.join(root, d, 'Main.java')
        rewrite_java(code_path)

def compile_java(root):
    def compile(pid):
        folder = os.path.join(root, pid, 'tmp')
        os.chdir(folder)
        result = subprocess.run(
            ['javac', '-g', 'Main.java'],
            capture_output = True,
            text = True
        )
        if result.stderr:
            return (0, result.stderr)
        else:
            return 1, 'pass'
    errs = []
    err_path = '/home/changshu/CodeMind/Tools/Variable/err_java.txt'
    file = open(err_path, 'w')
    for d in tqdm(os.listdir(root)):
        r, i = compile(d)
        if not r:
            errs.append(d)
            file.write(d + '\n')
            file.write(i)

    print(len(errs))

                

# rewrite_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java/p00006_s826507775/Main.java')
run_all_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java')
compile_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java')