from tqdm import tqdm
import os
import time
import subprocess

def main():
    ps = []
    root = '/home/eric/Workspace/Execution_LLM/prompts/avatar-java'
    for dir in os.listdir(root):
        log_path = os.path.join(root, dir, 'log.txt')
        if not os.path.exists(log_path):
            ps.append(dir)
    for d in tqdm(ps):
        trace_cmd = f"python3 /home/eric/Workspace/Execution_LLM/Scripts/trace_Java/trace_java.py {d}"
        
        subprocess.run(trace_cmd.split(' '))
        time.sleep(0.5)

def check_overtime(path):
    with open(path, 'r') as f:
        lines = f.readlines()
        if lines[-1].startswith('The application exited'):
            return False
        for line in lines:
            if 'Compile with -g to generate variable information' in line:
                return False
            if 'Nothing suspended.' in line:
                # print(path)
                return False
        return True
            

def rerun():
    root = '/home/eric/Workspace/Execution_LLM/prompts/avatar-java'
    dirs = []
    count= 0
    skipFlag = False
    for dir in os.listdir(root):
        if dir == "atcoder_ABC155_E" or dir == "atcoder_ABC129_E":
            continue
        logpath = f'{root}/{dir}/log.txt'
        if not os.path.exists(logpath):
            dirs.append(dir)
        # if os.path.exists(logpath):
        #     if check_overtime(logpath):
        #         dirs.append(dir)
        #         count += 1
    # print(len(dirs))
    for d in tqdm(dirs):
        trace_cmd = f"python3 /home/eric/Workspace/Execution_LLM/Scripts/trace_Java/trace_java.py {d}"
        log_file = os.path.join(root, d, 'log.txt')
        subprocess.run(['rm', '-rf', log_file])
        subprocess.run(trace_cmd.split(' '))
        time.sleep(0.5)
        
rerun()