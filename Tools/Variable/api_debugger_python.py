from utils import  collect_calls
import os
from subprocess import PIPE, Popen
import time
import re
from tqdm import tqdm

def send_input(process:Popen, input_stream:str, stop_signals:list) -> str:
    lines = []
    process.stdin.write(input_stream+'\n')
    process.stdin.flush()
    while True:
        line = process.stdout.readline()
        # print("test:", line.rstrip())
        lines.append(line.rstrip())
        # print(line)
        for s in stop_signals:
            if s in line:
                return '\n'.join(lines)

def extract_lineno(text:str)->int:
    # Regular expression pattern to find 'main_pdb_api.py()' followed by a number in parentheses
    pattern = r"main_pdb_api\.py\((\d+)\)"
    # Search for the pattern in the given text
    match = re.search(pattern, text)
    # If a match is found, return the number (as an integer), otherwise return None
    if match:
        return int(match.group(1))
    return None       

## Extract return values of APIs in a Python code
def extract_api(folder):
    code_path = os.path.join(folder, 'main.py')
    pdb_path = os.path.join(folder, 'main_pdb_api.py')
    wr_path = os.path.join(folder, 'api_value.txt')
    if os.path.exists(wr_path):
        return
    result_list = []
    if not os.path.exists(code_path) or not os.path.exists(pdb_path):
        return
    
    print(f'starting {code_path}')
    call_list = collect_calls(code_path)
    if not call_list:
        print('No API in file')
        return
    ##{'line_no_1':[call1, call2, ...], 'line_no_2': [call1, call2, ...]}

    linenos = call_list.keys() ## lines to insert breakpoints
    py_cmd = f"python -m pdb {pdb_path}"
    process = Popen(py_cmd, stdout=PIPE, stdin=PIPE, stderr=None, shell=True, text=True)  
    for lno in linenos:
        output = send_input(process,f"b {lno}", ['Breakpoint'])
        # print(output)
    while True:
        time.sleep(0.2)
        output = send_input(process, "continue", ['->', 'The program finished'])
        print(output)
        lineno = extract_lineno(output)
        if lineno and lineno in linenos:
            for call in call_list[lineno]:
                time.sleep(0.2)
                output = send_input(process, f"print({call})", ['\n'])
                api_return = output.split('\n')[0].lstrip('(Pdb) ')
                result_list.append(str(lineno) + '\t' + call + '\t' + api_return)
        if "The program finished" in output:
            break
    ## write results to .txt files:
    print(wr_path)
    with open(wr_path, 'w') as wr:
        wr.write('\n'.join(result_list))




if __name__ == '__main__':
    code_folder = '/home/changshu/CodeMind/dataset/mbpp/617'
    code_folder = '/home/changshu/CodeMind/dataset/humaneval/HumanEval_113'
    root = "/home/changshu/CodeMind/dataset/humaneval"
    for d in tqdm(os.listdir(root)):
        if d == 'HumanEval_70':
            continue
        if d == 'HumanEval_32':
            continue
        if d == 'HumanEval_75':
            continue
        folder = os.path.join(root, d)
        extract_api(folder)
    # search_none('/home/changshu/CodeMind/dataset/humaneval')