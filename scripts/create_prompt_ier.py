example_java = '''
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");

            int n = Integer.parseInt(strArr[0]);
            int a = Integer.parseInt(strArr[1]);
            int b = Integer.parseInt(strArr[2]);
            int answer = 0;

            for (int i = 1; i < n + 1; i++) {
                int num = i;
                int sum = 0;

                while (num != 0) {
                        sum += num % 10;
                        num /= 10;
                }

                if (sum >= a && sum <= b ) {
                        answer = answer + i;
                }
            }
            System.out.println(answer);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
'''

example_python = '''
N, A, B = map(int, input().split())
sum_1 = 0
for i in range(1,N+1):
    sum_order = 0
    i_str = str(i)
    n = len(i_str)
    for j in range(0,n):
        sum_order += int(i_str[j])
    if A <= sum_order <= B:
        sum_1 += i
print(sum_1)
'''

example_python_function = '''
def sum_of_integer(N, A, B):
    sum_1 = 0
    for i in range(1,N+1):
        sum_order = 0
        i_str = str(i)
        n = len(i_str)
        for j in range(0,n):
            sum_order += int(i_str[j])
        if A <= sum_order <= B:
            sum_1 += i
    return sum_1
'''

format_requirement = """
First analyze step by step about how the code processes the input to generate the output. 
Then print the output of the code based on your analysis.

Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]
"""

example_reasoning_java = """
<<<Analysis>>>
The variable n, variable a and variable b are initialized with 20, 2 and 5 respectively according to the input. And variable sum is initialized with 0.
It enters a for loop and it iterates from 1 to 20 to check each integer i in this range. The value of variable i is also passed to variable num.
Inside the for loop, it calculates the sum of the digits of the current interger num by repeatedlly extracting the digits of number with a while loop and adding it to variable sum.
Then it checks if the calculated variable sum falls within the range [2, 5]. If it does, it adds the current interger i to variable answer. The condition is met when i is 2,3,4,5,11,12,13,14 and 20.
After the loop finishes, it print the fianl value of variable answer as output, which is 84.
<<<Output>>>
84
[END-OF-RESPONSE]
"""

example_reasoning_python="""
<<<Analysis>>>
The variable N, variable A and variable B are initialized to 20, 2 and 5, respectively.
variable sum_1 is initialized to 0, which will be used to accumulate the sum of numbers meeting the condition.
The code then enters a loop that iterates from 1 to N (inclusive), meaning it will consider numbers from 1 to 20.
For each number i in this range, it calculates the sum of its digits and stores it in sum_order.
The code checks if sum_order is within the range [A, B], which is [2, 5] in this case. If it is, it adds the current number i to sum_1. The condition is met when i is 2,3,4,5,11,12,13,14 and 20.
After the loop finishes, the code prints the final value of sum_1, which is 84.
<<<Output>>>
84
[END-OF-RESPONSE]
"""

example_input = "20 2 5"
example_input_function = "sum_of_integer(20, 2, 5)"
question_print_output = "What would be the output of code execution given the following input:\n`"
question_return_value = "What would be the return value of "

instruction = """I want you to act as a {language} code executor. I will give you a piece of {language} code and its input. You need to think step by step and then print the output of code execution."""

def create_prompt_magicoder(code, code_input, dataset, pl):
    prompt_role = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
    template = prompt = prompt_role + "\n" + "@@ Instruction\n" + "$PROMPT_INSTRUCTION$\n" + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
        +"[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```$?$" + "\n" + format_requirement \
        +"[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\n" + "$QUESTION$" \
        + "```"+code_input + "```$?$\n" + format_requirement + "\n[Answer]\n@@ Response"
    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question_return_value) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", "?")
    return prompt
            

def create_prompt_gpt_codeqwen(code, code_input, dataset):
    if dataset == 'codenet_java' or dataset == 'avatar_java':
        prompt_instruction = instruction.format(language='Java')
        prompt = "<Instruction>" + prompt_instruction + "</Instruction>\n" + "Below is an example:\n<Example>\nConsider the following code\n" + example_java \
        +"\n[Question]\nWhat would be the output of code execution given the following input:\n```20 2 5```\n" + format_requirement \
        +"[Answer]\n" + example_reasoning_java + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\nWhat would be the output of code execution given the following input:\n" \
        + "```"+code_input + "```\n" + format_requirement + "\n[Answer]\n"
    if dataset in ['codenet_python', 'avatar_python']:
        prompt_instruction = instruction.format(language='Python')
        prompt = "<Instruction>" + prompt_instruction + "</Instruction>\n" + "Below is an example:\n<Example>\nConsider the following code\n" + example_python \
        +"\n[Question]\nWhat would be the output of code execution given the following input:\n```20 2 5```\n" + format_requirement \
        +"[Answer]\n" + example_reasoning_python + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\nWhat would be the output of code execution given the following input:\n" \
        + "```"+code_input + "```\n" + format_requirement + "\n[Answer]\n"
    if dataset in ["cruxeval", "mbpp", "humaneval"]:
        prompt_instruction = instruction.format(language='Python')
        prompt = "<Instruction>" + prompt_instruction + "</Instruction>\n" + "Below is an example:\n<Example>\nConsider the following code\n" + example_python_function \
        +"\n[Question]\nWhat would be the return value of `sum_of_integer(20, 2, 5)`?\n" + format_requirement \
        +"[Answer]\n" + example_reasoning_python + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\nWhat would be the return value of" \
        + "`"+code_input + "`?\n" + format_requirement + "\n[Answer]\n"
    return prompt


def create_prompt_codellama(code, code_input, dataset):
    if dataset == 'codenet_java' or dataset == 'avatar_java':
        prompt_instruction = instruction.format(language='Java')
        prompt = "[INST]"+ prompt_instruction + "[/INST]\n" + "[INST]\nConsider the following code:\n<Code>\n" + example_java \
        + "\n</Code>\n" +  "What would be the output of code execution given the following input:\n```20 2 5```\n" + format_requirement \
        + "[/INST]" + example_reasoning_java + "Consider the following code:\n" + "<Code>" + code + "\n</Code>\n" +  \
        + "What would be the output of code execution given the following input:\n" + "```"+code_input + "```\n" + format_requirement
    if dataset in ['codenet_python', 'avatar_python']:
        prompt_instruction = instruction.format(language='Python')
        prompt = "[INST]"+ prompt_instruction + "[/INST]\n" + "[INST]\nConsider the following code:\n<Code>\n" + example_python \
        + "\n</Code>\n" +  "What would be the output of code execution given the following input:\n```20 2 5```\n" + format_requirement \
        + "[/INST]" + example_reasoning_python + "Consider the following code:\n" + "<Code>" + code + "\n</Code>\n" +  \
        + "What would be the output of code execution given the following input:\n" + "```"+code_input + "```\n" + format_requirement
    if dataset in ["cruxeval", "mbpp", "humaneval"]:
        prompt_instruction = instruction.format(language='Python')
        prompt = "[INST]"+ prompt_instruction + "[/INST]\n" + "[INST]\nConsider the following code:\n<Code>\n" + example_python_function \
        + "\n</Code>\n" +  "What would be the return value of `f(20, 2, 5)`?\n" + format_requirement \
        + "[/INST]" + example_reasoning_python + "Consider the following code:\n" + "<Code>" + code + "\n</Code>\n" +  \
        + "What would be the return value of " + "```"+code_input + "```?\n" + format_requirement
    return prompt



def create_prompt_deepseekcoder(code, code_input, dataset, pl):
    prompt_role = "You are an AI programming assistant, utilizing the Deepseek Coder model, developed by Deepseek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
    template = prompt = prompt_role + "\n" + "### Instruction" + "$PROMPT_INSTRUCTION$\n" + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
        +"[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```$?$" + "\n" + format_requirement \
        +"[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\n" + "$QUESTION$" \
        + "```"+code_input + "```$?$\n" + format_requirement + "\n[Answer]\n### Response"
    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question_return_value) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", "?")
    return prompt   



def create_prompt_starcoder(code, code_input, dataset):
    if dataset == 'codenet_java' or dataset == 'avatar_java':
        prompt =  "Consider the following code:\n" + "<Code>\n" + example_java + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the output of code execution given the following input:\n```20 2 5```\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + example_reasoning_java \
        + "\nConsider the following code:\n" + "<Code>\n" + code + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the output of code execution given the following input:\n" +  "```"+code_input + "```\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + "<<<Analysis>>>"
    if dataset == 'codenet_python' or dataset=='avatar_python':
        prompt =  "Consider the following code:\n" + "<Code>\n" + example_python + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the output of code execution given the following input:\n```20 2 5```\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + example_reasoning_python \
        + "\nConsider the following code:\n" + "<Code>\n" + code + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the output of code execution given the following input:\n" +  "```"+code_input + "```\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + "<<<Analysis>>>" 
    if dataset in ["cruxeval", "mbpp", "humaneval"]:
        prompt =  "Consider the following code:\n" + "<Code>\n" + example_python_function + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the return value of `sum_of_integer(20, 2, 5)`?\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + example_reasoning_python \
        + "\nConsider the following code:\n" + "<Code>\n" + code + "\n</Code>\n" + "<<<Question>>>\n" \
        + "What would be the return value of " +  "`"+code_input + "`?\n" \
        + "First analyze step by step about how the code processes the input to generate the output.\nThen print the output of the code based on your analysis.\n" \
        + "<<<Analysis>>>"
    return prompt

def create_prompt_wizardcode(code, code_input, dataset, pl):
    prompt_role = "Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request."
    template = prompt = prompt_role + "\n" + "### Instruction:\n" + "$PROMPT_INSTRUCTION$\n" + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
        +"[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```$?$" + "\n" + format_requirement \
        +"[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code + "\n" + "[Question]\n" + "$QUESTION$" \
        + "```"+code_input + "```$?$\n" + format_requirement + "\n[Answer]\n### Response:"
    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question_print_output) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval", "cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question_return_value) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_python) \
            .replace("$?$", "?")
    return prompt


def create_prompt(model_id, code, code_input, dataset, pl):
    if "Magicoder" in model_id:
        prompt = create_prompt_magicoder(code, code_input, dataset, pl)
    if "gpt" in model_id or 'CodeQwen' in model_id:
        prompt = create_prompt_gpt_codeqwen(code, code_input, dataset, pl)
    if "CodeLlama" in model_id or "Llama2" in model_id or "Mistral" in model_id:
        prompt = create_prompt_codellama(code, code_input, dataset, pl)
    if "deepseek-coder" in model_id:
        prompt = create_prompt_deepseekcoder(code, code_input, dataset, pl)
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(code, code_input, dataset, pl)
    if "WizardCoder" in model_id:
        prompt = create_prompt_wizardcoder(code, code_input, dataset, pl)
    return prompt

if __name__ == "__main__":
    code_java = """import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = br.readLine();
            String ret = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(str.length() - i - 1);
                ret += ch;
            }
            System.out.println(ret);
        }
    }"""

    code_python = """def dfs(game):
    a,b = game.count("A"),game.count("B")
    if  (a == 5 and b < 4 or a < 4 and b == 5 or a == b == 5 or 
            a == 6 and b == 4 or a == 4 and b == 6):
        possible.add(game)
    elif (max(a,b) <= 4 or a == b == 4 or a == 5 and b == 4 or a == 4 and b == 5):
        possible.add(game)
        if game+"A" not in possible: dfs(game+"A")
        if game+"B" not in possible: dfs(game+"B")
            
j,y = map(int,raw_input().split())
possible = set([])
dfs("")
ans = []
for game in possible:
    if (game.count("A"),game.count("B")) == (j,y): ans.append(game)
print  "\n".join(sorted(ans))"""

    code_python_method = """def has_close_elements(numbers: List[float], threshold: float) -> bool:
    for idx, elem in enumerate(numbers):
        for idx2, elem2 in enumerate(numbers):
            if idx != idx2:
                distance = abs(elem - elem2)
                if distance < threshold:
                    return True

    return False"""
    code_input_python_function="has_close_elements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3) "

    code_input_java = "w32nimda"

    prompt = create_prompt("ise-uiuc/Magicoder-S-DS-6.7B", code_python, code_input_java, "CodeNet", "Python")
    print(prompt)


        
        
