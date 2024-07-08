from utils import extract_methods_java
import os
import subprocess
from tqdm import tqdm
def load_no_return():
    apis = []
    path = "/home/changshu/CodeMind/Tools/Variable/api_wo_return_java.txt"
    lines = open(path, 'r').readlines()
    for line in lines:
        line = line.strip('\n')
        apis.append(line)
    return apis


def rewrite_java(code_path):
    no_returns = load_no_return()
    api_dict = extract_methods_java(code_path)
    new_lines = []
    var_id = 0
    with open(code_path, 'r') as file:
        for current_line, line in enumerate(file, start=0):
            # new_lines.append(line)
            if current_line in api_dict.keys():
                for api in api_dict[current_line]:
                    if api[0]!='None':
                        replaced_line = line
                    else:
                        prefix = api[1].split('(')[0]
                        if prefix not in no_returns:
                            declaration = f"var newVariable_{var_id} = {api[1]};"
                            new_lines.append(declaration)
                            replaced_line = line.replace(api[1], f"newVariable_{var_id}")
                            # print(replaced_line.replace(' ','').replace(';','').replace('\n','').replace('\t',''))
                            if replaced_line.replace(' ','').replace(';','').replace('\n','').replace('\t','') == f"newVariable_{var_id}":
                                replaced_line = ''
                            var_id += 1
                        else:
                            replaced_line = line
                new_lines.append(replaced_line)
            else:
                new_lines.append(line)
    new_code =  ''.join(new_lines)
    write_folder = os.path.join('/'.join(code_path.split("/")[:-1]), 'stage_1')
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
        folder = os.path.join(root, pid, 'stage_1')
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

if __name__ == '__main__':
    run_all_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java')
    compile_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java')
    # rewrite_java("/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java/p02990_s740428120/Main.java")