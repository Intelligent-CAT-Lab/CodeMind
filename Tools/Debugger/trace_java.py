import sys
sys.path.append('/home/eric/Workspace/Execution_LLM/Scripts')
from utils import read_lines
import os
import subprocess
from subprocess import PIPE, Popen
import time

from tqdm import tqdm

class JavaTrace:
    def __init__(self, home, port=8000):
        self.root=home
        self.port=port
        self.javaPath=os.path.join(home, 'Main.java')
        self.classPath=os.path.join(home, 'Main.class')
        self.inputPath=os.path.join(home, 'input.txt')
        self.logPath = os.path.join(home, 'log.txt')
        self.sleep=0.2
        self.timeout = 100 ## give it 60 mins at most
        self.p_java = ''
        self.p_jdb = ''
        os.chdir(home)
    
    def compile_java(self):
        if not os.path.exists(self.javaPath):
            for d in os.listdir(self.root):
                if d.endswith('.java'):
                    java_path_src = os.path.join(self.root, d)
                    subprocess.run(['cp', java_path_src, self.javaPath])
        if os.path.exists(self.classPath):
            pass
        else:
            subprocess.run(['javac', '-g', 'Main.java'])
            time.sleep(0.5)
    
    def run_java(self):
        self.compile_java()
        
        
        cmd_java = f'java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=localhost:{str(self.port)} Main'
        self.p_java = Popen(cmd_java.split(' '), stdout=PIPE, stdin=PIPE, stderr=PIPE)
        inputs = read_lines(self.inputPath)
        
        
        for input in inputs:
            try:
                b_input = bytes(input+'\n', 'utf-8')
                self.p_java.stdin.write(b_input)
                self.p_java.stdin.flush()
                time.sleep(self.sleep)
            except:
                with open('/home/eric/Workspace/Execution_LLM/Scripts/errs/err_variables_java.txt', 'a+') as err:
                    err.write(f"java: {self.root}\n")
        
                        
    
    def run_jdb(self):
            
        cmd_jdb = f"timeout {self.timeout} jdb -attach localhost:{str(self.port)}"
        
        flog = open(self.logPath, 'w')
        flog.write('some text, as header of the file, sleep 1s \n')
        flog.flush()
        
        
        self.p_jdb = Popen(cmd_jdb.split(' '), stdout=flog, stdin=PIPE, stderr=PIPE)
        time.sleep(self.sleep)
        
        while True:
            try:
                if self.p_jdb.poll() is not None:
                    break
                self.p_jdb.stdin.write(b'step\n')
                self.p_jdb.stdin.flush()
                time.sleep(self.sleep)
                
                self.p_jdb.stdin.write(b'locals\n')
                self.p_jdb.stdin.flush()
                time.sleep(self.sleep)
            except Exception as e:
                pass
    
    def run(self):
        print(f"{self.root} started")
        if os.path.exists(self.inputPath):
            self.run_java()
            self.run_jdb()
            
            if self.p_java.poll() is not None:
                self.p_java.kill()
                
            if self.p_jdb.poll() is not None:
                self.p_jdb.kill()        
        print(f"{self.root} finished")



if __name__ == "__main__":
    PATH_1 = f'/home/eric/Workspace/Execution_LLM/prompts/avatar-java/{sys.argv[1]}'
    jt = JavaTrace(PATH_1)
    jt.run()

        
        