from subprocess import PIPE, Popen
import time
import os
from tqdm import tqdm
import sys

def trace_python(file_path, log_path):
    
    flog = open(log_path, 'w', encoding='utf-8')
    flog.write('header of the file \n')
    flog.flush()
    
    py_cmd = f"timeout 100m python {file_path}"
    proc_pdb = Popen(py_cmd.split(" "), stdout=flog, stdin=PIPE, stderr=PIPE)

    while True:
        try:
            if proc_pdb.poll() is not None:
                print("end")
                break
            proc_pdb.stdin.write(b's\n')
            proc_pdb.stdin.flush()
            # print("step")
            time.sleep(0.2)
            
            
            proc_pdb.stdin.write(b'locals()\n')
            proc_pdb.stdin.flush()
            # print("locals()")
            time.sleep(0.2)
            
        except Exception as e:
            print(e)
            pass

if __name__ == "__main__":
    # path_file = sys.argv[1]
    # path_log = sys.argv[2]
    path_file = "/home/changshu/LLM_REASONING/prompts/humaneval_notest/HumanEval_0/debugger.py"
    path_log = "/home/changshu/LLM_REASONING/prompts/humaneval_notest/HumanEval_0/log.txt"
    trace_python(path_file, path_log)