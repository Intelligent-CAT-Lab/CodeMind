import ast
from types import *
import re
import json
import os
from tqdm import tqdm

# Function to extract variables and their locations
def extract_variables(file_path):
    with open(file_path, 'r') as file:
        code = file.read()

    # Parse the code into an Abstract Syntax Tree (AST)
    tree = ast.parse(code)

    variables = []

    # Define a visitor class to traverse the AST
    class VariableVisitor(ast.NodeVisitor):
        def visit_Name(self, node):
            variables.append({
                'name': node.id,
                'location': f'Line {node.lineno}, Column {node.col_offset}'
            })
            self.generic_visit(node)

    # Visit the AST nodes to extract variables
    visitor = VariableVisitor()
    visitor.visit(tree)

    return variables

def extract_vars_from_ast(path:str):
    variable_dict = {}
    result = extract_variables(path)
    for variable in result:
        loc = variable['location'].replace(' ','').split(',')[0].replace("Line",'')
        if loc not in variable_dict.keys():
            variable_dict[loc] = []
        variable_dict[loc].append(variable['name'])
    return variable_dict


def extract_variable_from_log(path:str):
    line_nos = []
    vars = []
    variable_values = {}
    with open(path, 'r') as reader:
        text = reader.read()
        if "-> self.quitting = True" not in text:
            return {}
        text = "".join(text.split("(Pdb) --Return--")[:-1])
        lines = text.split("\n")
        for line in lines:
            
            if line.startswith("->"):
                ## line with location
                line_info = line.split("##")[-1]
                match = re.search(r'\(\s*(\d+)\s*\)', line_info)
                line_no = match.group(1)
                line_nos.append(line_no)
            if line.startswith("(Pdb) {"):
                obj_string = line.replace("(Pdb)", "")
                obj_string = obj_string.lstrip()
                obj_string = obj_string.replace("<lambda>","")
                obj_string = obj_string.replace(".<locals>","")
                try:
                    var_obj = eval(obj_string)
                except:
                    if obj_string.startswith("{'__name__'"):
                        var_obj = {}
                    else:
                        exp_matches = re.findall(r'<([^<>]+)>', obj_string)
                        # print(exp_matches)
                        for e in exp_matches:
                            obj_string = obj_string.replace(f"<{e}>", 'object')
                            print(path)
                            var_obj = eval(obj_string)
                        
                vars.append(var_obj)
    line_nos = line_nos[:-1]
    vars = vars[1:]
    
    for lno, var in zip(line_nos, vars):
        if lno not in variable_values.keys():
            variable_values[lno] = {}
        for v in var.keys():
            variable_values[lno][v] = var[v]
    return variable_values
  
# file_path = "/home/changshu/LLM_REASONING/prompts/cruxeval/sample_2/main.py"
# result = extract_vars_from_ast(file_path)
# print(result)

# log_path = "/home/changshu/LLM_REASONING/prompts/cruxeval/sample_43/log.txt"
# extract_variable_from_log(log_path)

def collect_variable_information(id: str):
    root_read = "/home/changshu/LLM_REASONING/prompts/humaneval_notest"
    code_path =  f"/home/changshu/LLM_REASONING/prompts/humaneval_notest/{id}/main.py"
    log_path = f"/home/changshu/LLM_REASONING/prompts/humaneval_notest/{id}/log.txt"
    wr_path = f"/home/changshu/CodeMind/dataset/humaneval/{id}/variables.json"
    
    if not os.path.exists(log_path):
        return
    vnames = extract_vars_from_ast(code_path)
    values = extract_variable_from_log(log_path)
    if not values:
        print(id)
        return
    final_values = {}
    # print(values)
    for lno in vnames.keys():
        if lno not in values.keys():
            continue
        for vn in vnames[lno]:
            if vn in values[lno].keys():
                if lno not in final_values.keys():
                    final_values[lno] = {}
                final_values[lno][vn] = values[lno][vn]
    try:
        with open(wr_path, 'w') as wr:
            json_data = json.dumps(final_values, indent=4)
            wr.write(json_data)
    except:
        print(final_values)
        print(id)


def collect_cruxeval():
    root = "/home/changshu/CodeMind/dataset/humaneval"
    for d in tqdm(os.listdir(root)):
       collect_variable_information(d) 

# collect_cruxeval()
# collect_variable_information("sample_344")
# 
# count = 0
# root = "/home/changshu/CodeMind/dataset/cruxeval"
# for d in tqdm(os.listdir(root)):
#     if not os.path.exists(f"/home/changshu/CodeMind/dataset/cruxeval/{d}/variables.json"):
#         count += 1
# print(count)

def collect_variable_information_tmp():
    root_read = "/home/changshu/LLM_REASONING/prompts/cruxeval"
    code_path =  f"/home/changshu/LLM_REASONING/MagicCoder/tmp/main.py"
    log_path = f"/home/changshu/LLM_REASONING/MagicCoder/tmp/log.txt"
    wr_path = f"//home/changshu/LLM_REASONING/MagicCoder/tmp/variables.json"
    
    if not os.path.exists(log_path):
        return
    vnames = extract_vars_from_ast(code_path)
    values = extract_variable_from_log(log_path)
    if not values:
        print(id)
        return
    final_values = {}
    # print(values)
    for lno in vnames.keys():
        if lno not in values.keys():
            continue
        for vn in vnames[lno]:
            if vn in values[lno].keys():
                if lno not in final_values.keys():
                    final_values[lno] = {}
                final_values[lno][vn] = values[lno][vn]
    try:
        with open(wr_path, 'w') as wr:
            json_data = json.dumps(final_values, indent=4)
            wr.write(json_data)
    except:
        print(final_values)
        print(id)

# collect_variable_information_tmp()
collect_cruxeval()