import ast
import os
from tree_sitter import Language, Parser
from pprint import pprint

# Load the Java language grammar
Language.build_library(
  'build/my-languages.so',
  ['/home/changshu/tree-sitter-java']  # Path to the tree-sitter-java repository
)

JAVA_LANGUAGE = Language('build/my-languages.so', 'java')
parser = Parser()
parser.set_language(JAVA_LANGUAGE)

def extract_methods_java(file_path):
    def extract_code(filename, start_line, start_col, end_line, end_col):
        extracted_code = []  
        with open(filename, 'r') as file:
            for current_line, line in enumerate(file, start=0):
                if current_line == start_line: 
                    if start_line == end_line:  
                        extracted_code.append(line[start_col-1:end_col])
                        break
                    else:
                        extracted_code.append(line[start_col-1:]) 
                elif start_line < current_line < end_line:
                    extracted_code.append(line) 
                elif current_line == end_line:
                    extracted_code.append(line[:end_col])
                    break

        return ''.join(extracted_code)
    
    def extract_method_names(tree):
        method_lists = []
        query = JAVA_LANGUAGE.query("""
    (method_declaration
      name: (identifier) @method)
    """)
        captures = query.captures(tree.root_node)
        for cap in captures:
            method_name = extract_code(file_path, 
                                       cap[0].start_point[0],
                                       cap[0].start_point[1],
                                       cap[0].end_point[0],
                                       cap[0].end_point[1]
                                       )
            method_lists.append(method_name.lstrip())
        return method_lists

    source_code = open(file_path, 'r').read()
    tree = parser.parse(bytes(source_code, "utf8"))
    root_node = tree.root_node

    code_bytes = bytes(source_code, "utf8")

    method_names = extract_method_names(tree)

    def extract_parameters(node):
        arguments = node.child_by_field_name('arguments')
        # print(bytes.decode(code_bytes[arguments.start_byte:arguments.end_byte]))
        args = []
        if arguments:
            for arg in arguments.children:
                if arg.type not in ["(", ",", ")"]:
                    a = bytes.decode(code_bytes[arg.start_byte: arg.end_byte])
                    args.append(a)
        return args

    def recurse(node):
        api_calls = []
        for child in node.children:
            if child.type == 'method_invocation':
                parent_node = child.parent
                identifier = 'None'
                
                for u in child.children:
                    print(u)
                print('====')
                
                if parent_node.type in ["variable_declarator", "assignment_expression"]:
                    ## find identifier
                    for c in parent_node.children:
                        if c.type == "identifier":
                            identifier = bytes.decode(code_bytes[c.start_byte: c.end_byte])
                            # identifier = extract_code(file_path, c.start_point[0], c.start_point[1], c.end_point[0], c.end_point[1])
                            # identifier = identifier.lstrip().lstrip('(').lstrip('[').lstrip(',').lstrip('&').lstrip('{').lstrip('*').lstrip('<').lstrip('>').lstrip('%').lstrip(')').lstrip('+').lstrip('-')
                
                # api = extract_code(file_path, child.start_point[0], child.start_point[1], child.end_point[0], child.end_point[1])
                
                api = bytes.decode(code_bytes[child.start_byte: child.end_byte])
                params = extract_parameters(child)
                # api = api.lstrip(' ').lstrip('=').lstrip('\t').rstrip('\n').lstrip('(').lstrip('[').lstrip(',').lstrip('&').lstrip('{').lstrip('*').lstrip('<').lstrip('>').lstrip('%').lstrip(')').lstrip('+').lstrip('-')
                # print(api)
                if '.println(' in api or '.print(' in api or '.printStackTrace(' in api or '.close(' in api:
                    continue
                lineno = child.start_point[0]
                ## check if the api is a method call which is declared inside Java
                name_flag = True
                # print(method_names)
                for mn in method_names:
                    if mn+'(' in api:
                        name_flag=False
                        continue
                if name_flag:
                    api_calls.append((lineno, identifier, api, params))
            api_calls.extend(recurse(child))
        return api_calls
    api_calls = recurse(root_node)
    api_dict = {}
    for (i,j,k,h) in api_calls:
        if i not in api_dict:
            api_dict[i] = []
        api_dict[i].append((j,k,h))
    return api_dict

class CallCollectorPy(ast.NodeVisitor):
    def __init__(self, path):
        self.node = ast.parse(open(path,'r').read())
        self.call_dict = {}
    def generic_visit(self, node):
        try:
            if isinstance(node, ast.Call):
                if node.lineno not in self.call_dict.keys():
                    self.call_dict[node.lineno] = []
                self.call_dict[node.lineno].append(ast.unparse(node))
        except AttributeError:
            try:
                print(node, node.attr)
            except AttributeError:
                print(node)
        return super().generic_visit(node)


def inject_pdb(folder):
    read_path = os.path.join(folder, 'main.py')
    input_path = os.path.join(folder, 'input.txt')
    write_path = os.path.join(folder, 'main_pdb_api.py')
    if not os.path.exists(input_path):
        return
    code = open(read_path, 'r').read()
    code_input = open(input_path, 'r').read()
    new_code = code + '\n' + code_input
    with open(write_path, 'w') as f:
        f.write(new_code)

def inject_all(root):
    for d in os.listdir(root): 
        folder = os.path.join(root, d)
        if not os.path.exists(folder):
            continue
        inject_pdb(folder)


## extract methods defined in a Py file
def extract_method_names(filename):
    with open(filename, 'r') as file:
        file_contents = file.read()
    
    tree = ast.parse(file_contents)
    
    method_names = [node.name for node in ast.walk(tree) if isinstance(node, ast.FunctionDef)]
    return method_names

def collect_calls(path):
    call_dict = {}
    defined_funs = extract_method_names(path)
    cpy = CallCollectorPy(path)
    cpy.generic_visit(cpy.node)
    for k in cpy.call_dict.keys():
        call_list = []
        for c in cpy.call_dict[k]:
            flag = True
            for j in defined_funs:
                if j in c:
                    flag = False
                    break
            if flag:
                call_list.append(c)
        if call_list:
            call_dict[k] = call_list
    return call_dict


def search_none(root):
    apis = []
    for i in os.listdir(root):
        fpath = os.path.join(root, i, 'api_value.txt')
        if not os.path.exists(fpath):
            continue
        with open(fpath, 'r', encoding='utf-8') as f:
            lines = f.readlines()
            for line in lines:
                line = line.strip('\n')
                value = line.split('\t')[2]
                api = line.split('\t')[1]
                if value == 'None':
                    api = api.split('(')[0].split('.')[-1]
                    apis.append(api)
                    if api == 'count_distinct_characters':
                        print(fpath)
    print(set(apis))
           

if __name__ == "__main__":
    # inject_all('/home/changshu/CodeMind/dataset/mbpp')
    # inject_all('/home/changshu/CodeMind/dataset/cruxeval')
    # inject_all('/home/changshu/CodeMind/dataset/humaneval')
    # rewrite_humaneval()
    a = extract_methods_java('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Java/p02004/Main.java')
    print(a)