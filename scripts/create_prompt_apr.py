

def create_prompt_magicoder(buggy, entry):
    prompt = f'''You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.
@@ Instruction
Fix bugs in {entry}.
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

@@ Response
'''
    return prompt

def create_prompt_gpt_codeqwen(buggy, entry):
    prompt=f'''Fix bugs in {entry}.    
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}
'''
    return prompt

def create_prompt_codellama(buggy, entry):
    prompt = f'''[INST]<<SYS>>
You are an expert Python programmer.
<</SYS>>Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}
[/INST]
'''
    return prompt

def create_prompt_mistral(buggy, entry):
    prompt = f'''[INST]Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}
[/INST]
'''
    return prompt

def create_prompt_deepseekcoder(buggy, entry):
    prompt = f'''You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.
### Instruction:
Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

### Response:
'''
    return prompt

def create_prompt_starcoder(buggy, entry):
    prompt=f'''<fim_prefix>Fix bugs in {entry}.    
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

<fim_suffix><fim_middle>
'''
    return prompt

def create_prompt_wizardcoder(buggy, entry):
    prompt = f'''Below is an instruction that describes a task. Write a response that appropriately completes the request.
### Instruction:
Fix bugs in {entry}. 
Enclose the fixed code inside ```python and ```.

Buggy Code:
{buggy}

## Response:
'''
    return prompt

def create_prompt(model_id, buggy, nl):
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(buggy, nl)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(buggy, nl)
    if "CodeLlama" in model_id or "Llama-2" in model_id:
        prompt = create_prompt_codellama(buggy, nl)
    if "Mistral" in model_id:
        prompt = create_prompt_mistral(buggy, nl)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(buggy, nl)
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(buggy, nl)
    if "WizardCoder" in model_id:
        prompt = create_prompt_wizardcoder(buggy, nl)
    return prompt