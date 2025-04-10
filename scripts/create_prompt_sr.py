
def create_prompt_magicoder(nl, signature, test):
    prompt_template = """You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.
@@ Instruction
Write a Python solution {signature}to the following problem:
```
{nl}
```
{assertion}
Enclose your solution in ```python and ```. Only return the function.
@@ Response
"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt


def create_prompt_gpt_codeqwen(nl, signature, test):
    prompt_template = """Your task is to write a Python function {signature}to solve a programming problem.
You must use the same function name, signature and variable names as the example test case.
Do not generate test cases. You should only write the function.
[Formatting Instructions]
- Start your code with ```python
- End your code with ```
- In the python code, you must use exactly the same signature as the example test case.

Problem: 
```
{nl}
```
{assertion}
"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt


def create_prompt_codellama(nl, signature, test):
    prompt_template = """[INST]Your task is to write a Python function {signature}to solve a programming problem.
The Python code must be between [PYTHON] and [/PYTHON] tags.

Problem: 
```
{nl}
```
{assertion}
[/INST]"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt

def create_prompt_deepseekcoder(nl, signature, test):
    prompt_template = """You are an expert Python programmer.Your task is to write a Python function {signature}to solve a programming problem.
### Instruction
Write a Python solution to the following problem:
```
{nl}
```
{assertion}
Enclose your solution in ```python and ```. Only print the function. Don not add any natural langugae explanation to your response.
### Response"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt

def create_prompt_starcoder(nl, signature, test):
    prompt_template = """<fim_prefix> Your task is to write a Python function {signature}to solve a programming problem.

Problem:
```
{nl}
```
{assertion}
Enclose your solution in [python] and [/python]. Only print the function. Do not add any natural language description to your response.

Response:<fim_suffix><fim_middle>"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt


def create_prompt_wizardcoder(nl, signature, test):
    prompt_template = """You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.
### Instruction:
Write a Python solution {signature}to the following problem:
```
{nl}
```
{assertion}
Enclose your solution in ```python and ```. Only return the function.
### Response:
"""
    prompt = prompt_template.format(signature=signature, nl=nl, assertion=test)
    return prompt



def create_prompt(model_id, nl, signature, test):
    if signature:
        signature_name = "```" + signature + "``` "
    else:
        signature_name=""
    if test:
        assertion_info = "Your code should satisfy the following assertion:\n" + test
    else:
        assertion_info = ""
    
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(nl, signature, assertion_info)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(nl, signature, assertion_info)
    
    if "CodeLlama" in model_id or "Mistral" in model_id:
        prompt = create_prompt_codellama(nl, signature, assertion_info)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(nl, signature, assertion_info)
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(nl, signature, assertion_info)
    if "WizardCoder" in model_id:
        prompt = create_prompt_wizardcoder(nl, signature, assertion_info)
    return prompt

# if __name__ == "__main__":
#     nl = "Write a function to count the number of occurrences of a number in a given list."
#     signature = "def frequency(a,x)"
#     assertion = "assert frequency([1,2,3], 4) == 0"

#     nl_heval = '''def is_simple_power(x, n):
#     """Your task is to write a function that returns true if a number x is a simple
#     power of n and false in other cases.
#     x is a simple power of n if n**int=x
#     '''
#     p = create_prompt_magicoder(nl_heval, "", assertion)
#     print(p)
