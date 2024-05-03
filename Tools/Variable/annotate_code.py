import os
import json
def annotate(folder: str):
    '''add comments for the original code'''
    code_path = os.path.join(folder, "main.py")
    variable_path = os.path.join(folder, "variables.json")
    write_path = os.path.join(folder, "var_main.py")
    if not os.path.join(variable_path):
        return 1
    try:
        variables_data = json.load(open(variable_path, 'r'))
    except:
        return 1
    if not variables_data:
        return 1
    # print(variables_data)
    new_lines = []
    with open(code_path, 'r') as r:
        lines = r.readlines()
        for i, line in enumerate(lines, start=1):
            if str(i) in variables_data.keys():
                pl_list = []
                vars = variables_data[str(i)].keys()
                for var in vars:
                    pl_list.append('"' + var + '"' +" : ''")
                comment = "\t## " + "{" + ",".join(pl_list) + "}"
                new_line = line.rstrip("\n") + comment + '\n'
                new_lines.append(new_line)
            else:
                new_lines.append(line)
    # print("".join(new_lines))
    with open(write_path, 'w') as wr:
        for l in new_lines:
            wr.write(l)
    return 0
# annotate("/home/changshu/CodeMind/dataset/cruxeval/sample_797")

def annotate_1(folder: str):
    '''add comments for the original code'''
    code_path = os.path.join(folder, "main.py")
    variable_path = os.path.join(folder, "variables.json")
    write_path = os.path.join(folder, "var_main_1.py")
    if not os.path.join(variable_path):
        return 1
    try:
        variables_data = json.load(open(variable_path, 'r'))
    except:
        return 1
    if not variables_data:
        return 1
    # print(variables_data)
    new_lines = []
    with open(code_path, 'r') as r:
        lines = r.readlines()
        for i, line in enumerate(lines, start=1):
            if str(i) in variables_data.keys():
                pl_list = []
                vars = variables_data[str(i)].keys()
                for var in vars:
                    pl_list.append(var+ " = CLRJ")
                comment = "\t## " + " | ".join(pl_list)
                new_line = line.rstrip("\n") + comment + '\n'
                new_lines.append(new_line)
            else:
                new_lines.append(line)
    # print("".join(new_lines))
    with open(write_path, 'w') as wr:
        for l in new_lines:
            wr.write(l)
    return 0


def annotate_2(folder: str):
    '''add comments for the original code'''
    code_path = os.path.join(folder, "main.py")
    variable_path = os.path.join(folder, "variables.json")
    write_path = os.path.join(folder, "var_main_2.py")
    if not os.path.join(variable_path):
        return 1
    try:
        variables_data = json.load(open(variable_path, 'r'))
    except:
        return 1
    if not variables_data:
        return 1
    # print(variables_data)
    new_lines = []
    with open(code_path, 'r') as r:
        lines = r.readlines()
        for i, line in enumerate(lines, start=1):
            if str(i) in variables_data.keys():
                pl_list = []
                vars = variables_data[str(i)].keys()
                for var in vars:
                    pl_list.append(var+ " = []")
                comment = "\t## " + " | ".join(pl_list)
                new_line = line.rstrip("\n") + comment + '\n'
                new_lines.append(new_line)
            else:
                new_lines.append(line)
    # print("".join(new_lines))
    with open(write_path, 'w') as wr:
        for l in new_lines:
            wr.write(l)
    return 0

def annotate_3(folder: str):
    '''add comments for the original code'''
    code_path = os.path.join(folder, "main.py")
    variable_path = os.path.join(folder, "variables.json")
    write_path = os.path.join(folder, "var_main_3.py")
    if not os.path.join(variable_path):
        return 1
    try:
        variables_data = json.load(open(variable_path, 'r'))
    except:
        return 1
    if not variables_data:
        return 1
    # print(variables_data)
    new_lines = []
    with open(code_path, 'r') as r:
        lines = r.readlines()
        for i, line in enumerate(lines, start=1):
            if str(i) in variables_data.keys():
                pl_list = []
                vars = variables_data[str(i)].keys()
                for var in vars:
                    pl_list.append(var+ " = CLRJ")
                comment = "\t## " +"<state>" + " | ".join(pl_list) + "</state>"
                new_line = line.rstrip("\n") + comment + '\n'
                new_lines.append(new_line)
            else:
                new_lines.append(line)
    # print("".join(new_lines))
    with open(write_path, 'w') as wr:
        for l in new_lines:
            wr.write(l)
    return 0


def annotate_cruxeval():
    count = 0
    root = "/home/changshu/CodeMind/dataset/cruxeval"
    for d in os.listdir(root):
        folder = os.path.join(root, d)
        re = annotate_3(folder)
        count += re
    print(count)

folder = "/home/changshu/LLM_REASONING/MagicCoder/tmp"
# annotate(folder)
annotate_cruxeval()