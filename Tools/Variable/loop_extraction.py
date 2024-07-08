import ast
import os
import astunparse
import json
import javalang
from read_debugger_log import parse_log_python
import traceback

class PythonLoopExtractor(ast.NodeVisitor):
    def __init__(self):
        self.loops = {
            'For': [],
            'While': []
        }            
    def visit_For(self, node):
        # print(f"For loop iterating over {ast.dump(node.target)} with iterable {ast.dump(node.iter)}")
        iterators = []
        if isinstance(node.target, ast.Name):
            iterator_name = node.target.id
            iterators.append(iterator_name)
        if isinstance(node.target, ast.Tuple):
            ## multiple iterators
            for iter in node.target.elts:
                if isinstance(iter, ast.Tuple):
                    for j in iter.elts:
                        iterators.append(j.id)
                else:
                    iterators.append(iter.id)
        lno = node.lineno
        iterable = astunparse.unparse(node.iter)
        if isinstance(node.iter, ast.Name):
            pass
        elif isinstance(node.iter, ast.Constant):
            pass
        elif isinstance(node.iter, ast.Call):
            pass
        else:
            pass
            # print(ast.unparse(node.iter))
        loop_data = {
            'iterator': iterators,
            'condition': iterable,
            'line_no': lno
        }
        self.loops['For'].append(loop_data)      
    
        self.generic_visit(node)

    def visit_While(self, node):
        lno = node.lineno
        condition = astunparse.unparse(node.test)
        # print(condition)
        # print(ast.dump(node.test))
        loop_data = {
            'condition': condition,
            'line_no': lno
        }
        self.loops['While'].append(loop_data)
        self.generic_visit(node)

def loop_extraction_py(file_name):
    # print(file_name)
    ## Extract loop iterators and conditions
    # print(file_name)
    code = open(file_name, 'r').read()
    parsed_code = ast.parse(code)
    extractor = PythonLoopExtractor()
    extractor.visit(parsed_code)
    # print(extractor.loops)
    return extractor.loops

def run_all_py(root):
    results = {}
    dataset_name=root.split('/')[-1]
    write_dir = f"/home/changshu/CodeMind/dataset/Loops/{dataset_name}.json"
    for d in os.listdir(root):
        # if d!='HumanEval_107':
        #     continue
        if 'CodeNet' in root:
            code_path = os.path.join(root, d, 'main', 'main.py')
        elif 'humaneval' in root:
            code_path = f"/home/changshu/LLM_REASONING/prompts/humaneval_notest/{d}/main.py"
        else:
            code_path = os.path.join(root, d, 'main.py')
        data = loop_extraction_py(code_path)
        if len(data['For']) > 0 or len(data['While']) > 0:
            results[d] = {
                'For': [],
                'While': data['While']
            }
            
            if dataset_name == 'cruxeval':
                log_path = f"/home/changshu/LLM_REASONING/prompts/cruxeval/{d}/log.txt"
            if dataset_name == 'mbpp':
                log_path = f"/home/changshu/LLM_REASONING/prompts/mbpp/{d}/log.txt"
            if dataset_name == 'humaneval':
                log_path = f"/home/changshu/LLM_REASONING/prompts/humaneval_notest/{d}/log.txt"
            if dataset_name == 'CodeNet-Python':
                log_path=f"/home/changshu/LLM_REASONING/prompts/single_line_all_1_Python/{d}/log.txt"
            try:
                s, states = parse_log_python(log_path)
                if not s:
                    print(log_path)
                for i in data['For']:
                    states_all = []
                    line_no = i['line_no'] - 1
                    for j in i['iterator']:
                        iter_states = [n[j] for n in states[str(line_no)]]
                        states_all.append(iter_states)
                    results[d]['For'].append({
                        'iterator': i['iterator'],
                        'condition': i['condition'],
                        'line_no': i['line_no'],
                        'iterator_gt': states_all
                    })
            except Exception:
                # traceback.print_exc()
                print("**"+log_path)
    with open(write_dir, 'w') as f:
        json.dump(results, f, indent=4)
    

def loop_extraction_java(file_name):
    code = open(file_name, 'r').read()
    tree = javalang.parse.parse(code)
    for _, node in tree:
        if isinstance(node, javalang.tree.ForStatement):
            print(node.control)

a = loop_extraction_py('/home/changshu/LLM_REASONING/prompts/single_line_all_1_Python/p02881/main/main.py')
print(a)
# run_all_py('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Python')

# loop_extraction_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java/p00007/Main.java')