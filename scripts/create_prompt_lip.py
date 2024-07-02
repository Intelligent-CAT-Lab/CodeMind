
python_example_methods = """
[TASK]Your task is to replce the `??` in the comment with variable states during the execution process of the code. Only replace `??` with variable states, DO NOT output any extra information.[/TASK]
[Example]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]x=??[/STATE]
        sum += x
    return sum

Input: fun(5)

[Response]
[PYTHON]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]x=[0, 1, 2, 3, 4, 5][/STATE]
        sum += x
    return sum
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(input_string):
    char_count = {}
    for char in input_string:
        if char in char_count: ## [STATE]char=??[/STATE]
            char_count[char] += 1
        else:
            char_count[char] = 1
    return char_count

Input: fun("hello world")

[Response]
[PYTHON]
def fun(input_string):
    char_count = {}
    for char in input_string:
        if char in char_count: ## [STATE]char=['h', 'e', 'l', 'l', 'o', '', 'w', 'o', 'r', 'l', 'd'][/STATE]
            char_count[char] += 1
        else:
            char_count[char] = 1
    return char_count
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(numbers):
    squares = []
    for number in numbers: ## [STATE]number=??[/STATE]
        squares.append(number ** 2)
    return squares

Input: fun([3,4,6,7,8])

[Response]
[PYTHON]
def fun(numbers):
    squares = []
    for number in numbers: ## [STATE]number=[3, 4, 6, 7, 8][/STATE]
        squares.append(number ** 2)
    return squares
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(size):
    table = []
    for i in range(1, size + 1): ## [STATE]i=??[/STATE]
        row = []
        for j in range(1, size + 1): ## [STATE]j=??[/STATE]
            row.append(i * j)
        table.append(row)
    return table

Input: fun(5)

[Response]
[PYTHON]
def fun(size):
    table = []
    for i in range(1, size + 1): ## [STATE]i=[1, 2, 3, 4, 5][/STATE]
        row = []
        for j in range(1, size + 1): ## [STATE]j=[1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5][/STATE]
            row.append(i * j)
        table.append(row)
    return table
[/PYTHON]
[/Response]
[/Example]
"""

def create_prompt_magicoder(code, code_input, dataset, pl):
    if dataset in ["mbpp", "humaneval", "cruxeval"]:
        instruction = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
        prompt = instruction + '\n@@ Instruction\n' + python_example_methods + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n@@Response\n'
    return prompt

def create_prompt_deepseekcoder(code, code_input, dataset, pl):
    if dataset in ["mbpp", "humaneval", "cruxeval"]:
        instruction = "You are an AI programming assistant, utilizing the Deepseek Coder model, developed by Deepseek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
        prompt = instruction + '\n### Instruction\n' + python_example_methods + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n### Response\n'
    return prompt

def create_prompt_codellama(code, code_input, dataset, pl):
    if dataset in ["mbpp", "humaneval", "cruxeval"]:
        instruction = "You are an expert Python programmer"
        prompt = "[INST]<<SYS>>" + instruction + "<</SYS>>"  + python_example_methods + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n[/INST]\n'
    return prompt

def create_prompt_gpt_codeqwen(code, code_input, dataset, pl):
    if dataset in ["mbpp", "humaneval", "cruxeval"]:
        prompt =  python_example_methods + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n[/INST]\n'
    return prompt

def create_prompt(model_id, code, code_input, dataset, pl):
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(code, code_input, dataset, pl)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(code, code_input, dataset, pl)
    if "CodeLlama" in model_id or "Llama-2" in model_id or "Mistral" in model_id:
        prompt = create_prompt_codellama(code, code_input, dataset, pl)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(code, code_input, dataset, pl)
    # if "starcoder" in model_id:
    #     prompt = create_prompt_starcoder(code, code_input, dataset, pl)
    # if "WizardCoder" in model_id:
    #     prompt = create_prompt_wizardcoder(code, code_input, dataset, pl)
    return prompt

