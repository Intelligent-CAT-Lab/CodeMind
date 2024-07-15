python_example_methods=""
python_example_methods_scratchpad = """
[TASK]Your task is to replce the `??` in the comment with states during the execution process of the code. Only replace `??` with variable states, DO NOT output any extra information.[/TASK]
[Example]
def fun(original_list, condition_value):
    filtered_list = original_list[:]
    index = 0
    while index < len(filtered_list): ##[STATE]{"filtered_list":??, "len(filtered_list)":??}[/STATE]
        print(len(filtered_list))
        if filtered_list[index] < condition_value:
            filtered_list.pop(index)
        else:
            index += 1
    return filtered_list

Input: fun([5, 10, 15, 20, 25], 15)

[Response]
[PYTHON]
def fun(original_list, condition_value):
    filtered_list = original_list[:]
    index = 0
    while index < len(filtered_list): ##[STATE]{"filtered_list":[5, 10, 15, 20, 25], "len(filtered_list)":5}[/STATE][STATE]{"filtered_list":[5, 10, 15, 20, 25], "len(filtered_list)":4}[/STATE][STATE]{"filtered_list":[5, 10, 15, 20, 25], "len(filtered_list)": 3}[/STATE][STATE]{"filtered_list":[5, 10, 15, 20, 25], "len(filtered_list)":3}[/STATE][STATE]{"filtered_list":[5, 10, 15, 20, 25], "len(filtered_list)":3}[/STATE]
        print(len(filtered_list))
        if filtered_list[index] < condition_value:
            filtered_list.pop(index)
        else:
            index += 1
    return filtered_list
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]{"range(N)":??, "N":??}[/STATE]
        sum += x
    return sum

Input: fun(5)
    
[Response]
[PYTHON]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]{"range(N)":[0, 1, 2, 3, 4], "N":5}[/STATE][STATE]{"range(N)":[0, 1, 2, 3, 4], "N":5}[/STATE][STATE]{"range(N":[0, 1, 2, 3, 4], "N":5}[/STATE][STATE]{"range(N)":[0, 1, 2, 3, 4], "N"=5}[/STATE]
        sum += x
    return sum
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(numbers):
    total = 0
    for index, value in enumerate(numbers): ##[STATE]{"enumerate(numbers)":??, "numbers":??}[/STATE]
        print(list(enumerate(numbers)))
        total += value ** 2
    return total


Input: fun([1, 2, 3, 4])

[Response]
[PYTHON]
def fun(numbers):
    total = 0
    for index, value in enumerate(numbers): ##[STATE]{"enumerate(numbers)":[(0, 1), (1, 2), (2, 3), (3, 4)], "numbers":[1, 2, 3, 4]}[/STATE]STATE]{"enumerate(numbers)":[(0, 1), (1, 2), (2, 3), (3, 4)], "numbers":[1, 2, 3, 4]}[/STATE]STATE]{"enumerate(numbers)":[(0, 1), (1, 2), (2, 3), (3, 4)], "numbers":[1, 2, 3, 4]}[/STATE]STATE]{"enumerate(numbers)":[(0, 1), (1, 2), (2, 3), (3, 4)], "numbers":[1, 2, 3, 4]}[/STATE]
        print(list(enumerate(numbers)))
        total += value ** 2
    return total
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(n):
    total = 0
    for i in range(2, 1 + n // 2): ## [STATE]{"range(2, 1 + n // 2)":??, "1 + n // 2":??}[/STATE]
        total += i * i
    return total

Input: fun(8)

[Response]
[PYTHON]
def fun(n):
    total = 0
    for i in range(2, 1 + n // 2): ## [STATE]{"range(2, 1 + n // 2)":[2, 3, 4], "1 + n // 2":5}[/STATE][STATE]{"range(2, 1 + n // 2)":[2, 3, 4], "1 + n // 2":5}[/STATE][STATE]{"range(2, 1 + n // 2)":[2, 3, 4], "1 + n // 2":5}[/STATE]
        total += i * i
    return total
[/PYTHON]
[/Response]
[/Example]
"""

python_example_methods_scratchpad_bk="""
[TASK]Your task is to replce the `??` in the comment with states during the execution process of the code. Only replace `??` with variable states, DO NOT output any extra information.[/TASK]
[Example]
def fun(original_list, condition_value):
    filtered_list = original_list[:]
    index = 0
    while index < len(filtered_list): ##[STATE]{filtered_list=??, len(filtered_list)=??}[/STATE]
        print(len(filtered_list))
        if filtered_list[index] < condition_value:
            filtered_list.pop(index)
        else:
            index += 1
    return filtered_list

Input: fun([5, 10, 15, 20, 25], 15)

[Response]
[PYTHON]
def fun(original_list, condition_value):
    filtered_list = original_list[:]
    index = 0
    while index < len(filtered_list): ##[STATE]{filtered_list=[5, 10, 15, 20, 25], len(filtered_list)=5}[/STATE][STATE]{filtered_list=[5, 10, 15, 20, 25], len(filtered_list)=4}[/STATE][STATE]{filtered_list=[5, 10, 15, 20, 25], len(filtered_list)=3}[/STATE][STATE]{filtered_list=[5, 10, 15, 20, 25], len(filtered_list)=3}[/STATE][STATE]{filtered_list=[5, 10, 15, 20, 25], len(filtered_list)=3}[/STATE]
        print(len(filtered_list))
        if filtered_list[index] < condition_value:
            filtered_list.pop(index)
        else:
            index += 1
    return filtered_list
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]{range(N)=??, N=??}[/STATE]
        sum += x
    return sum

Input: fun(5)
    
[Response]
[PYTHON]
def fun(N):
    sum = 0
    for x in range(N): ## [STATE]{range(N)=[0, 1, 2, 3, 4], N=5}[/STATE][STATE]{range(N)=[0, 1, 2, 3, 4], N=5}[/STATE][STATE]{range(N)=[0, 1, 2, 3, 4], N=5}[/STATE][STATE]{range(N)=[0, 1, 2, 3, 4], N=5}[/STATE]
        sum += x
    return sum
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(numbers):
    total = 0
    for index, value in enumerate(numbers): ##[STATE]{enumerate(numbers)=??, numbers=??}[/STATE]
        print(list(enumerate(numbers)))
        total += value ** 2
    return total


Input: fun([1, 2, 3, 4])

[Response]
[PYTHON]
def fun(numbers):
    total = 0
    for index, value in enumerate(numbers): ##[STATE]{enumerate(numbers)=[(0, 1), (1, 2), (2, 3), (3, 4)], numbers=[1, 2, 3, 4]}[/STATE]STATE]{enumerate(numbers)=[(0, 1), (1, 2), (2, 3), (3, 4)], numbers=[1, 2, 3, 4]}[/STATE]STATE]{enumerate(numbers)=[(0, 1), (1, 2), (2, 3), (3, 4)], numbers=[1, 2, 3, 4]}[/STATE]STATE]{enumerate(numbers)=[(0, 1), (1, 2), (2, 3), (3, 4)], numbers=[1, 2, 3, 4]}[/STATE]
        print(list(enumerate(numbers)))
        total += value ** 2
    return total
[/PYTHON]
[/Response]
[/Example]

[Example]
def fun(n):
    total = 0
    for i in range(2, 1 + n // 2): ## [STATE]{range(2, 1 + n // 2)=??, 1 + n // 2=??}[/STATE]
        total += i * i
    return total

Input: fun(8)

[Response]
[PYTHON]
def fun(n):
    total = 0
    for i in range(2, 1 + n // 2): ## [STATE]{range(2, 1 + n // 2)=[2, 3, 4], 1 + n // 2=5}[/STATE][STATE]{range(2, 1 + n // 2)=[2, 3, 4], 1 + n // 2=5}[/STATE][STATE]{range(2, 1 + n // 2)=[2, 3, 4], 1 + n // 2=5}[/STATE]
        total += i * i
    return total
[/PYTHON]
[/Response]
[/Example]
"""
python_example_codenet_scratchpad = """
[TASK]Your task is to replce the `??` in the comment with variable states during the execution process of the code. Only replace `??` with variable states, DO NOT output any extra information.[/TASK]
[Example]
N = int(input())
sum = 0
for x in range(N): ## [STATE]{x=??}[/STATE]
    sum += x
print(sum)

Input:5

[Response]
[PYTHON]
N = int(input())
sum = 0
for x in range(N): ## [STATE]{x=0}[/STATE][STATE]{x=1}[/STATE][STATE]{x=2}[/STATE][STATE]{x=3}[/STATE][STATE]{x=4}[/STATE][STATE]{x=5}[/STATE]
    sum += x
print(sum)
[/PYTHON]
[/Response]
[/Example]

[Example]
input_string=str(input())
char_count = {}
for char in input_string:
    if char in char_count: ## [STATE]{char=??}[/STATE]
        char_count[char] += 1
    else:
        char_count[char] = 1
print(char_count)

Input:hello world

[Response]
[PYTHON]
input_string=str(input())
char_count = {}
for char in input_string:
    if char in char_count: ## [STATE]{char='h'}[/STATE][STATE]{char='e'}[/STATE][STATE]{char='l'}[/STATE][STATE]{char='l'}[/STATE][STATE]{char='o'}[/STATE][STATE]{char='w'}[/STATE][STATE]{char='o'}[/STATE][STATE]{char='r'}[/STATE][STATE]{char='l'}[/STATE][STATE]{char='d'}[/STATE]
        char_count[char] += 1
    else:
        char_count[char] = 1
print(char_count)
[/PYTHON]
[/Response]
[/Example]

[Example]
input_str = input()
numbers = [int(num) for num in input_str.split()]
squares = []
for number in numbers: ## [STATE]{number=??}[/STATE]
    squares.append(number ** 2)
print(squares)

Input:3 4 6 7 8

[Response]
[PYTHON]
input_str = input()
numbers = [int(num) for num in input_str.split()]
squares = []
for number in numbers: ## [STATE]{number=3}[/STATE][STATE]{number=4}[/STATE][STATE]{number=6}[/STATE][STATE]{number=7}[/STATE][STATE]{number=8}[/STATE]
    squares.append(number ** 2)
print(squares)
[/PYTHON]
[/Response]
[/Example]

[Example]
size = int(input())
table = []
for i in range(1, size + 1): ## [STATE]{i=??}[/STATE]
    row = []
    for j in range(1, size + 1): ## [STATE]{j=??}[/STATE]
        row.append(i * j)
    table.append(row)
print(table)

Input:5

[Response]
[PYTHON]
size = int(input())
table = []
for i in range(1, size + 1): ## [STATE]{i=1}[/STATE][STATE]{i=2}[/STATE][STATE]{i=3}[/STATE][STATE]{i=4}[/STATE][STATE]{i=5}[/STATE]
    row = []
    for j in range(1, size + 1): ## [STATE]{j=1}[/STATE][STATE]{j=2}[/STATE][STATE]{j=3}[/STATE][STATE]{j=4}[/STATE][STATE]{j=5}[/STATE][STATE]{j=1}[/STATE][STATE]{j=2}[/STATE][STATE]{j=3}[/STATE][STATE]{j=4}[/STATE][STATE]{j=5}[/STATE][STATE]{j=1}[/STATE][STATE]{j=2}[/STATE][STATE]{j=3}[/STATE][STATE]{j=4}[/STATE][STATE]{j=5}[/STATE][STATE]{j=1}[/STATE][STATE]{j=2}[/STATE][STATE]{j=3}[/STATE][STATE]{j=4}[/STATE][STATE]{j=5}[/STATE][STATE]{j=1}[/STATE][STATE]{j=2}[/STATE][STATE]{j=3}[/STATE][STATE]{j=4}[/STATE][STATE]{j=5}[/STATE]
        row.append(i * j)
    table.append(row)
print(table)
[/PYTHON]
[/Response]
[/Example]
"""

python_example_codenet= """
[TASK]Your task is to replce the `??` in the comment with variable states during the execution process of the code. Only replace `??` with variable states, DO NOT output any extra information.[/TASK]
[Example]
N = int(input())
sum = 0
for x in range(N): ## [STATE]x=??[/STATE]
    sum += x
print(sum)

Input:5

[Response]
[PYTHON]
N = int(input())
sum = 0
for x in range(N): ## [STATE]x=[0, 1, 2, 3, 4, 5][/STATE]
    sum += x
print(sum)
[/PYTHON]
[/Response]
[/Example]

[Example]
input_string=str(input())
char_count = {}
for char in input_string:
    if char in char_count: ## [STATE]char=??[/STATE]
        char_count[char] += 1
    else:
        char_count[char] = 1
print(char_count)

Input:hello world

[Response]
[PYTHON]
input_string=str(input())
char_count = {}
for char in input_string:
    if char in char_count: ## [STATE]char=['h', 'e', 'l', 'l', 'o', '', 'w', 'o', 'r', 'l', 'd'][/STATE]
        char_count[char] += 1
    else:
        char_count[char] = 1
print(char_count)
[/PYTHON]
[/Response]
[/Example]

[Example]
input_str = input()
numbers = [int(num) for num in input_str.split()]
squares = []
for number in numbers: ## [STATE]number=??[/STATE]
    squares.append(number ** 2)
print(squares)

Input:3 4 6 7 8

[Response]
[PYTHON]
input_str = input()
numbers = [int(num) for num in input_str.split()]
squares = []
for number in numbers: ## [STATE]number=[3, 4, 6, 7, 8][/STATE]
    squares.append(number ** 2)
print(squares)
[/PYTHON]
[/Response]
[/Example]

[Example]
size = int(input())
table = []
for i in range(1, size + 1): ## [STATE]i=??[/STATE]
    row = []
    for j in range(1, size + 1): ## [STATE]j=??[/STATE]
        row.append(i * j)
    table.append(row)
print(table)

Input:5

[Response]
[PYTHON]
size = int(input())
table = []
for i in range(1, size + 1): ## [STATE]i=[1, 2, 3, 4, 5][/STATE]
    row = []
    for j in range(1, size + 1): ## [STATE]j=[1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5][/STATE]
        row.append(i * j)
    table.append(row)
print(table)
[/PYTHON]
[/Response]
[/Example]
"""



def create_prompt_magicoder(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['CodeNet', 'Avatar']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            instruction = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
            prompt = instruction + '\n@@ Instruction\n' + example + '\n' + code + '\n\nInput:' + code_input + '\n\n' + '[Response]\n@@Response\n'
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            instruction = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
            prompt = instruction + '\n@@ Instruction\n' + example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n@@Response\n'
    return prompt

def create_prompt_deepseekcoder(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['CodeNet', 'Avatar']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            instruction = "You are an AI programming assistant, utilizing the Deepseek Coder model, developed by Deepseek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
            prompt = instruction + '\n### Instruction\n' + example + '\n' + code + '\n\nInput' + code_input + '\n\n' + '[Response]\n### Response\n'
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            instruction = "You are an AI programming assistant, utilizing the Deepseek Coder model, developed by Deepseek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
            prompt = instruction + '\n### Instruction\n' + example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n### Response\n'
        return prompt

def create_prompt_codellama(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['CodeNet', 'Avatar']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            instruction = "You are an expert Python programmer."
            prompt = "[INST]<<SYS>>" + instruction + "<</SYS>>"  + example + '\n' + code + '\n\nInput:' + code_input + '\n\n' + '[Response]\n[/INST]\n'      
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            instruction = "You are an expert Python programmer."
            prompt = "[INST]<<SYS>>" + instruction + "<</SYS>>"  + example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n[/INST]\n'
    return prompt

def create_prompt_gpt_codeqwen(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['CodeNet', 'Avatar']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            prompt =  example + '\n' + code + '\n\nInput:' + code_input + '\n\n' + '[Response]\n'
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            prompt =  example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n'
    return prompt

def create_prompt_wizardcoder(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ["CodeNet", 'Avatar']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            instruction = "Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request."
            prompt = instruction + '\n### Instruction:\n' + example + '\n' + code + '\n\nInput:' + code_input + '\n\n' + '[Response]\n### Response:\n'
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            instruction = "Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request."
            prompt = instruction + '\n### Instruction:\n' + example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n### Response:\n'
    return prompt

def create_prompt_mistral(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['Avatar', 'CodeNet']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            instruction = "You are an expert Python programmer."
            prompt = "[INST]" + instruction  + example + '\n' + code + '\n\n' + code_input + '\n\nInput:' + '[Response]\n[/INST]\n'
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            instruction = "You are an expert Python programmer."
            prompt = "[INST]" + instruction  + example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n[/INST]\n'
    return prompt


def create_prompt_starcoder(code, code_input, dataset, pl, scratch_pad):
    if pl == 'Python':
        if dataset in ['Avatar', 'CodeNet']:
            if scratch_pad:
                example = python_example_codenet_scratchpad
            else:
                example = python_example_codenet
            prompt =  "<fim_prefix>"+example + '\n' + code + '\n\n' + code_input + '\n\nInput:' + '[Response]\n<fim_suffix><fim_middle>\n'    
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            if scratch_pad:
                example = python_example_methods_scratchpad
            else:
                example = python_example_methods
            prompt =  "<fim_prefix>"+example + '\n' + code + '\n\n' + code_input + '\n\n' + '[Response]\n<fim_suffix><fim_middle>\n'
    return prompt

def create_prompt(model_id, code, code_input, dataset, pl, scratch_pad):
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(code, code_input, dataset, pl, scratch_pad)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(code, code_input, dataset, pl, scratch_pad)
    if "CodeLlama" in model_id or "Llama-2" in model_id:
        prompt = create_prompt_codellama(code, code_input, dataset, pl, scratch_pad)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(code, code_input, dataset, pl, scratch_pad)
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(code, code_input, dataset, pl, scratch_pad)
    if "WizardCoder" in model_id:
        prompt = create_prompt_wizardcoder(code, code_input, dataset, pl, scratch_pad)
    if "Mistral" in model_id:
        prompt = create_prompt_mistral(code, code_input, dataset, pl, scratch_pad)
    return prompt

