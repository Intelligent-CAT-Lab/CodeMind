

def create_prompt_magicoder(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt = f'''You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.
@@ Instruction
Fix bugs in {entry}.
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
@@ Response
'''
    return prompt

def create_prompt_gpt_codeqwen(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt=f'''Fix bugs in {entry}.    
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
'''
    return prompt

def create_prompt_codellama(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt = f'''[INST]<<SYS>>
You are an expert Python programmer.
<</SYS>>Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
[/INST]
'''
    return prompt

def create_prompt_mistral(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt = f'''[INST]Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
[/INST]
'''
    return prompt

def create_prompt_deepseekcoder(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt = f'''You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.
### Instruction:
Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
### Response:
'''
    return prompt

def create_prompt_starcoder(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt=f'''<fim_prefix>Fix bugs in {entry}.    
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
<fim_suffix><fim_middle>
'''
    return prompt

def create_prompt_wizardcoder(buggy, entry, tests):
    if tests:
        test_info = f"Tests:\n{tests}"
    else:
        test_info = ""
    prompt = f'''Below is an instruction that describes a task. Write a response that appropriately completes the request.
### Instruction:
Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

{test_info}
## Response:
'''
    return prompt

def create_prompt(model_id, buggy, nl, tests):
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(buggy, nl, tests)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(buggy, nl, tests)
    if "CodeLlama" in model_id or "Llama-2" in model_id:
        prompt = create_prompt_codellama(buggy, nl, tests)
    if "Mistral" in model_id:
        prompt = create_prompt_mistral(buggy, nl, tests)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(buggy, nl, tests)
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(buggy, nl, tests)
    if "WizardCoder" in model_id:
        prompt = create_prompt_wizardcoder(buggy, nl, tests)
    return prompt