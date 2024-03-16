import ast
import random
import json
from typing import Dict, List, Tuple, Union, Set
from cast_type import MultiLineOutput, cast_to_type, get_input_output_files
from typing import cast

class EmptyList:
    def __init__(self):
        pass

    def __repr__(self):
        return "EmptyList()"


class ListOfType:
    def __init__(self, elem_type):
        self.elem_type = elem_type

    def __repr__(self):
        return f"ListOfType({self.elem_type})"


class DictionaryOfType:
    def __init__(self, key_type, value_type):
        self.key_type = key_type
        self.value_type = value_type

    def __repr__(self):
        return f"DictionaryOfType({self.key_type}, {self.value_type})"
class SetOfType:
    def __init__(self, elem_type):
        self.elem_type = elem_type

    def __repr__(self):
        return f"SetOfType({self.elem_type})"
    
class MixedSet:
    def __init__(self, types):
        self.types = types

    def __repr__(self):
        return f"MixedSet({self.types})"

class MixedList:
    def __init__(self, types):
        self.types = types

    def __repr__(self):
        return f"MixedList({self.types})"


class MixedDictionary:
    def __init__(self, key_types, value_types):
        self.key_types = key_types
        self.value_types = value_types

    def __repr__(self):
        return f"MixedDictionary({self.key_types}, {self.value_types})"


class TupleOfType:
    def __init__(self, elem_type):
        self.elem_type = elem_type

    def __repr__(self):
        return f"TupleOfType({self.elem_type})"


class MixedTuple:
    def __init__(self, types):
        self.types = types

    def __repr__(self):
        return f"MixedTuple({self.types})"


class Function:
    def __init__(self):
        pass

    def __repr__(self):
        return f"Function"


def parse_type(
    value: Union[int, str, bool, List, Dict]
) -> Union[ListOfType, DictionaryOfType, int, str, bool, TupleOfType]:
    if isinstance(value, list):
        if not value:
            return EmptyList()

        element_types = set(type(elem) for elem in value)
        if len(element_types) == 1:
            return ListOfType(next(iter(element_types)))
        else:
            return MixedList(element_types)

    elif isinstance(value, dict):
        if not value:
            return DictionaryOfType(None, None)

        key_types = set(type(key) for key in value.keys())
        value_types = set(type(val) for val in value.values())

        if len(key_types) == 1 and len(value_types) == 1:
            return DictionaryOfType(next(iter(key_types)), next(iter(value_types)))
        else:
            return MixedDictionary(key_types, value_types)
    elif isinstance(value, tuple):
        if not value:
            return TupleOfType(None)
        elem_types = set(parse_type(elem) for elem in value)
        if len(elem_types) == 1:
            return TupleOfType(next(iter(elem_types)))
        else:
            return MixedTuple(elem_types)
    elif isinstance(value, set):
        if not value:
            return SetOfType(None)
        elem_types = set(type(elem) for elem in value)
        if len(elem_types) == 1:
            return SetOfType(next(iter(elem_types)))
        else:
            return MixedSet(elem_types)
    else:
        return type(value)


def mutate_int(value: int) -> int:
    print(value)
    mutated = value + random.randint(-100, 100)
    print(mutated)
    return mutated


class FunctionArgumentMutator(ast.NodeTransformer):
    def visit_Call(self, node: ast.Call) -> ast.AST:
        """
        Method to visit and update all function calls' nodes
        """
        self.generic_visit(node)

        def mutate_element(element):
            if type(element) == ast.Constant:
                value_type = parse_type(element.value)
                print(value_type)
                return ast.Constant(value=mutate(element.value, value_type), kind=None)
            elif type(element) == ast.List:
                return ast.List(
                    elts=[mutate_element(e) for e in element.elts], ctx=ast.Load()
                )
            elif type(element) == ast.Tuple:
                return ast.Tuple(
                    elts=[mutate_element(e) for e in element.elts], ctx=ast.Load()
                )
            elif type(element) == ast.Dict:
                return ast.Dict(
                    keys=element.keys,
                    values=[mutate_element(v) for v in element.values],
                )
            else:
                return element

        node.args = [mutate_element(a) for a in node.args]
        return node


def mutate_function(value: str) -> str:
    """
    Mutate the arguments of input function
    """
    # Parse input string to AST
    parsed_tree = ast.parse(value)
    # Initiate the transformer
    transformer = FunctionArgumentMutator()
    # Apply the transformer to the tree
    mutated_tree = transformer.visit(parsed_tree)
    # Reform the mutated AST to code
    mutated_code = ast.unparse(mutated_tree)
    print(mutated_code)
    return mutated_code


def mutate_float(value: float) -> float:
    return value + random.uniform(-100, 100)

def mutate_complex(value: complex) -> complex:
    return value + random.uniform(-100, 100) + random.uniform(-100, 100) * 1j


def mutate_str(value: str) -> str:
    # randomly add or remove characters or add new characters
    if random.choice([True, False]):
        if random.choice([True, False]) and value:
            index = random.randint(0, len(value) - 1)
            value = value[:index] + value[index + 1 :]
        else:
            index = random.randint(0, len(value))
            value = value[:index] + chr(random.randint(32, 126)) + value[index:]
    else:
        subset_locs = random.sample(range(len(value)), random.randint(0, len(value)))
        subset_locs.sort()
        # mutate
        value_ls = list(value)
        for loc in subset_locs:
            value_ls[loc] = chr(random.randint(32, 126))
        value = "".join(value_ls)

    return value


def mutate_bool(value: bool) -> bool:
    return not value


def mutate_tuple(value: Tuple) -> Tuple:
    value_ls = list(value)
    # deal with the value list as a list
    mutated_ls = mutate(value_ls, parse_type(value_ls))
    # convert back to tuple
    return tuple(mutated_ls)

def mutate_set(value: Set) -> Set:
    value_ls = list(value)
    # deal with the value list as a list
    mutated_ls = mutate(value_ls, parse_type(value_ls))
    # convert back to tuple
    return set(mutated_ls)

def mutate_list_element(value: List) -> List:
    res = value.copy()
    res_mutated = [mutate(x, parse_type(x)) for x in res]
    return res_mutated


def mutate_list_structure(val: List) -> List:
    value = val.copy()
    if random.choice([True, False]) and value and len(value) > 1:
        value.pop(random.randint(0, len(value) - 1))
    else:
        if value:
            elem_type = type(value[0])
            new_element = mutate(elem_type(), parse_type(elem_type()))
            value.append(new_element)
        else:
            value.append(mutate_int(0))  # Default for empty list
    return value


def mutate_dict(
    value: Dict, key_type: Union[type, None], value_type: Union[type, None]
) -> Dict:
    value = value.copy()
    if random.choice([True, False]) and value:
        # Remove a random key
        key = random.choice(list(value.keys()))
        value.pop(key)
    else:
        # Add a new key
        if key_type:
            new_key = mutate(key_type(), parse_type(key_type()))
            new_value = mutate(value_type(), parse_type(value_type()))
            value[new_key] = new_value
    return value



def parse_type_from_assertion_str(
    assertion_str: str,
) -> Tuple[type, Union[int, float, str, bool, List, Dict]]:
    parts = assertion_str.split("==")
    if len(parts) != 2:
        # raise ValueError("Invalid assertion format")
        return None, None

    # Extract the value part and evaluate it
    val_str = parts[1].strip()
    print("val_str", val_str)
    # We first try to parse if the value string contains function calls
    # If it fails, we try to evaluate it as a string
    # Use AST
    parse_res = ast.parse(val_str)

    try:
        val = ast.literal_eval(val_str)
        val_type = parse_type(val)
        return val_type, val
    except (ValueError, SyntaxError):
        try:
            print(val_str)
            val = eval(val_str)

            val_type = parse_type(val)
            return val_type, val
        except:
            if isinstance(parse_res.body[0], ast.Expr):
                return Function, val_str
            else:
                raise ValueError("Could not evaluate the value part of the assertion")


def mutate(
    value: Union[int, float, str, bool, List, Dict, Tuple, Function],
    value_type: Union[
        type,
        ListOfType,
        DictionaryOfType,
        TupleOfType,
        MixedList,
        MixedTuple,
        MixedDictionary,
        None,
    ],
) -> Union[int, float, str, bool, List, Dict, Tuple, Function]:
    if value is None:
        print("None")
        return False
    if isinstance(value_type, ListOfType) or isinstance(value_type, MixedList):
        if random.choice([True, False]):
            return mutate_list_element(value)
        else:
            return mutate_list_structure(value)
    elif isinstance(value_type, EmptyList):
        return mutate_list_structure(value)
    elif isinstance(value_type, DictionaryOfType):
        return mutate_dict(value, value_type.key_type, value_type.value_type)
    elif isinstance(value_type, MixedDictionary):
        return mutate_dict(value, None, None)
    elif value_type == int:
        return mutate_int(value)
    elif value_type == float:
        return mutate_float(value)
    elif value_type == str:
        return mutate_str(value)
    elif value_type == bool:
        return mutate_bool(value)
    elif value_type == complex:
        return mutate_complex(value)
    elif isinstance(value_type, TupleOfType) or isinstance(value_type, MixedTuple):
        return mutate_tuple(value)
    elif isinstance(value_type, SetOfType) or isinstance(value_type, MixedSet):
        return mutate_set(value)
        
    elif isinstance(value_type,set):
        return mutate_set(value)
    elif value_type == type(None):
        return value
    elif value_type == Function:
        return mutate_function(value)
    else:
        raise TypeError(f"Mutation not supported for type: {value_type}")


def gen_mutated_assertion(assertion_str: str) -> str:
    val_type, val = parse_type_from_assertion_str(assertion_str)
    print(val_type)
    mutated_val = mutate(val, val_type)
    if val_type == str:
        return f"{assertion_str.split('==')[0]} == '{mutated_val}'"
    else:
        return f"{assertion_str.split('==')[0]} == {mutated_val}"

def get_mutated_assertion_from_input_output_strs(
    input_str: str, output_str: str, function_name: str
) -> (str, str):
    """
    Get a mutated assertion from input and output strings
    """
    input_val = cast_to_type(input_str)
    output_val = cast_to_type(output_str)
    print("output_value",output_val)
    if isinstance(output_val, MultiLineOutput):
        output_type = parse_type(output_val.get_values())
        mutated_val = mutate(output_val.get_values(), output_type)
        assert isinstance(mutated_val, list), "Output should be a list"
        mutated_val = '\n'.join([str(x) for x in mutated_val])
        
    else:
        output_type = parse_type(output_val)
        print("output_type",output_type)
        mutated_val = mutate(output_val, output_type)
    
    if isinstance(mutated_val, list):
        mutated_val = ' '.join([str(x) for x in mutated_val])
    
    return str(input_val), str(mutated_val)
    
    
    
    
    

if __name__ == "__main__":
    input_files, output_files = get_input_output_files('/home/changshu/CodeMind/dataset/CodeNet/CodeNet-Python')
    for input_file, output_file in zip(input_files, output_files):
        code_input = open(input_file).read().strip()
        code_output = open(output_file).read().strip()
        
        input_val, output_val = get_mutated_assertion_from_input_output_strs(code_input, code_output, "")
        print(output_val)
        wr_file= output_file.replace("output.txt", "misleading_output.txt")
        with open(wr_file, 'w') as wr:
            wr.write(output_val)
        # print(output_val)