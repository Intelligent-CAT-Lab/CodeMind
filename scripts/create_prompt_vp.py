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

example_python_cruxeval = '''
def total_sum(n):
    total_sum = 0
    for num in range(1, n):
        if num % 2 == 0:
            total_sum += num
    return total_sum
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

example_response_python="""
def sum_of_integer(N, A, B):    ##[INPUT]{N:20, A:2, B:5}[/INPUT]
    sum_1 = 0   ##[STATE]{sum_1: 0}[/STATE]
    for i in range(1,N+1):  ##[STATE]{i: 1, N:20}[/STATE][STATE]{i: 2, N:20}[/STATE][STATE]{i: 3, N:20}[/STATE][STATE]{i: 4, N:20}[/STATE][STATE]{i: 5, N:20}[/STATE][STATE]{i: 6, N:20}[/STATE][STATE]{i: 7, N:20}[/STATE][STATE]{i: 8, N:20}[/STATE][STATE]{i: 9, N:20}[/STATE][STATE]{i: 10, N:20}[/STATE][STATE]{i: 11, N:20}[/STATE][STATE]{i: 12, N:20}[/STATE][STATE]{i: 13, N:20}[/STATE][STATE]{i: 14, N:20}[/STATE][STATE]{i: 15, N:20}[/STATE][STATE]{i: 16, N:20}[/STATE][STATE]{i: 17, N:20}[/STATE][STATE]{i: 18, N:20}[/STATE][STATE]{i: 19, N:20}[/STATE][STATE]{i: 20, N:20}[/STATE]
        sum_order = 0   ##[STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE][STATE]{sum_order: 0}[/STATE]
        i_str = str(i)  ##[STATE]{i_str: '1', i:1}[/STATE][STATE]{i_str: '2', i:2}[/STATE][STATE]{i_str: '3', i:3}[/STATE][STATE]{i_str: '4', i:4}[/STATE][STATE]{i_str: '5', i:5}[/STATE][STATE]{i_str: '6', i:6}[/STATE][STATE]{i_str: '7', i:7}[/STATE][STATE]{i_str: '8', i:8}[/STATE][STATE]{i_str: '9', i:9}[/STATE][STATE]{i_str: '10', i:10}[/STATE][STATE]{i_str: '11', i:11}[/STATE][STATE]{i_str: '12', i:12}[/STATE][STATE]{i_str: '13', i:13}[/STATE][STATE]{i_str: '14', i:14}[/STATE][STATE]{i_str: '15', i:15}[/STATE][STATE]{i_str: '16', i:16}[/STATE][STATE]{i_str: '17', i:17}[/STATE][STATE]{i_str: '18', i:18}[/STATE][STATE]{i_str: '19', i:19}[/STATE][STATE]{i_str: '20', i:20}[/STATE]
        n = len(i_str)  ##[STATE]{n: 1, i_str: '1'}[/STATE][STATE]{n: 1, i_str: '2'}[/STATE][STATE]{n: 1, i_str: '3'}[/STATE][STATE]{n: 1, i_str: '4'}[/STATE][STATE]{n: 1, i_str: '5'}[/STATE][STATE]{n: 1, i_str: '6'}[/STATE][STATE]{n: 1, i_str: '7'}[/STATE][STATE]{n: 1, i_str: '8'}[/STATE][STATE]{n: 1, i_str: '9'}[/STATE][STATE]{n: 2, i_str: '10'}[/STATE][STATE]{n: 2, i_str: '11'}[/STATE][STATE]{n: 2, i_str: '12'}[/STATE][STATE]{n: 2, i_str: '13'}[/STATE][STATE]{n: 2, i_str: '14'}[/STATE][STATE]{n: 2, i_str: '15'}[/STATE][STATE]{n: 2, i_str: '16'}[/STATE][STATE]{n: 2, i_str: '17'}[/STATE][STATE]{n: 2, i_str: '18'}[/STATE][STATE]{n: 2, i_str: '19'}[/STATE][STATE]{n: 2, i_str: '20'}[/STATE]
        for j in range(0,n):    ##[STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 1}[/STATE][STATE]{j: 0, n: 2}[/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE][STATE]{j: 0, n: 2}[/STATE][/STATE][STATE]{j: 1, n: 2}[/STATE]
            sum_order += int(i_str[j])  ##[STATE]{sum_order: 1, i_str:'1', j:0}[/STATE][STATE]{sum_order: 2, i_str:'2', j:0}[/STATE][STATE]{sum_order: 3, i_str:'3', j:0}[/STATE][STATE]{sum_order: 4, i_str:'4', j:0}[/STATE][STATE]{sum_order: 5, i_str:'5', j:0}[/STATE][STATE]{sum_order: 6, i_str:'6', j:0}[/STATE][STATE]{sum_order: 7, i_str:'7', j:0}[/STATE][STATE]{sum_order: 8, i_str:'8', j:0}[/STATE][STATE]{sum_order: 9, i_str:'9', j:0}[/STATE][STATE]{sum_order: 1, i_str:'10', j:0}[/STATE][STATE]{sum_order: 1, i_str:'10', j:1}[/STATE][STATE]{sum_order: 1, i_str:'11', j:0}[/STATE][STATE]{sum_order: 2, i_str:'11', j:1}[/STATE][STATE]{sum_order: 1, i_str:'12', j:0}[/STATE][STATE]{sum_order: 3, i_str:'12', j:1}[/STATE][STATE]{sum_order: 1, i_str:'13', j:0}[/STATE][STATE]{sum_order: 4, i_str:'13', j:1}[/STATE][STATE]{sum_order: 1, i_str:'14', j:0}[/STATE][STATE]{sum_order: 5, i_str:'14', j:1}[/STATE][STATE]{sum_order: 1, i_str:'15', j:0}[/STATE][STATE]{sum_order: 6, i_str:'15', j:1}[/STATE][STATE]{sum_order: 1, i_str:'16', j:0}[/STATE][STATE]{sum_order: 7, i_str:'16', j:1}[/STATE][STATE]{sum_order: 1, i_str:'17', j:0}[/STATE][STATE]{sum_order: 8, i_str:'17', j:1}[/STATE][STATE]{sum_order: 1, i_str:'18', j:0}[/STATE][STATE]{sum_order: 9, i_str:'18', j:1}[/STATE][STATE]{sum_order: 1, i_str:'19', j:0}[/STATE][STATE]{sum_order: 10, i_str:'19', j:1}[/STATE][STATE]{sum_order: 2, i_str:'20', j:0}[/STATE][STATE]{sum_order: 2, i_str:'20', j:1}[/STATE]
        if A <= sum_order <= B: ##[STATE]{A:2, sum_order:1, B:5}[/STATE][STATE]{A:2, sum_order:2, B:5}[/STATE][STATE]{A:2, sum_order:3, B:5}[/STATE][STATE]{A:2, sum_order:4, B:5}[/STATE][STATE]{A:2, sum_order:5, B:5}[/STATE][STATE]{A:2, sum_order:6, B:5}[/STATE][STATE]{A:2, sum_order:7, B:5}[/STATE][STATE]{A:2, sum_order:8, B:5}[/STATE][STATE]{A:2, sum_order:9, B:5}[/STATE][STATE]{A:2, sum_order:1, B:5}[/STATE][STATE]{A:2, sum_order:2, B:5}[/STATE][STATE]{A:2, sum_order:3, B:5}[/STATE][STATE]{A:2, sum_order:4, B:5}[/STATE][STATE]{A:2, sum_order:5, B:5}[/STATE][STATE]{A:2, sum_order:6, B:5}[/STATE][STATE]{A:2, sum_order:7, B:5}[/STATE][STATE]{A:2, sum_order:8, B:5}[/STATE][STATE]{A:2, sum_order:9, B:5}[/STATE][STATE]{A:2, sum_order:10, B:5}[/STATE]
            sum_1 += i  ##[STATE]{sum_1:2, i:2}[/STATE][STATE]{sum_1:5, i:3}[/STATE][STATE]{sum_1:9, i:4}[/STATE][STATE]{sum_1:14, i:5}[/STATE][STATE]{sum_1:25, i:11}[/STATE][STATE]{sum_1:37, i:12}[/STATE][STATE]{sum_1:50, i:13}[/STATE][STATE]{sum_1:64, i:14}[/STATE][STATE]{sum_1:84, i:20}[/STATE]
    return sum_1    ##[OUTPUT]84[/OUTPUT]
"""

example_response_python_cruxeval = """
def f(n):   ##[STATE]{n:10}[/STATE]
    total_sum = 0   ##[STATE]{total_sum:0}[/STATE]
    for num in range(1, n): ##[STATE]{num:1, n:10}[/STATE][STATE]{num:2, n:10}[/STATE][STATE]{num:3, n:10}[/STATE][STATE]{num:4, n:10}[/STATE][STATE]{num:5, n:10}[/STATE][STATE]{num:6, n:10}[/STATE][STATE]{num:7, n:10}[/STATE][STATE]{num:8, n:10}[/STATE][STATE]{num:9, n:10}[/STATE]
        if num % 2 == 0:    ##[STATE]{num:1}[/STATE][STATE]{num:2}[/STATE][STATE]{num:3}[/STATE][STATE]{num:4}[/STATE][STATE]{num:5}[/STATE][STATE]{num:6}[/STATE][STATE]{num:7}[/STATE][STATE]{num:8}[/STATE][STATE]{num:9}[/STATE]
            total_sum += num    ##[STATE]{total_sum:2, num:2}[/STATE][STATE]{total_sum:6, num:4}[/STATE][STATE]{total_sum:12, num:6}[/STATE][STATE]{total_sum:20, num:8}[/STATE]
    return total_sum    ##[OUTPUT]20[/OUTPUT]
"""

example_input = "20 2 5"
example_input_function = "sum_of_integer(20, 2, 5)"
example_input_cruxeval = 'f(10)'
question = "Annotate the code with variable states given the following input:\n"
# question = "What would be the return value of "

instruction = """I want you to act as a {language} code executor. I will give you a piece of {language} code and its input. You need to annotate the code with variable states in comments."""

def create_prompt_gpt_codeqwen(code, code_input, dataset, pl):
    template =  "<Instruction> " + "$PROMPT_INSTRUCTION$\n" + "</Instruction>\n" + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
    + "\n[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```\n"  \
    + "[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code \
    +  "\n" + "[Question]\n" + "$QUESTION$" + "```"+code_input + "```"+ "\n[Answer]\n"

    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", "?")
        if dataset in ["cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_cruxeval) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_cruxeval) \
            .replace("$EXAMPLE_REASONING$", example_response_python_cruxeval) \
            .replace("$?$", "?")  
    return prompt

def create_prompt_magicoder(code, code_input, dataset, pl):
    prompt_role = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
    template =  prompt_role + "\n" + "@@ Instruction\n" + "$PROMPT_INSTRUCTION$\n"  + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
    + "\n[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```\n"  \
    + "[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code \
    +  "\n" + "[Question]\n" + "$QUESTION$" + "```"+code_input + "```"+ "\n[Answer]\n@@ Response"

    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", "?")
        if dataset in ["cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_cruxeval) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_cruxeval) \
            .replace("$EXAMPLE_REASONING$", example_response_python_cruxeval) \
            .replace("$?$", "?")  
    return prompt 


def create_prompt_codellama(code, code_input, dataset, pl):
    # prompt_role = "You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions."
    template =  "[INST]" + "$PROMPT_INSTRUCTION$\n"  +"[/INST]\n"+ "[INST]"+"Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
    + "\n[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```[/INST]\n"  \
    + "[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code \
    +  "\n" + "[Question]\n" + "$QUESTION$" + "```"+code_input + "```"+ "\n[Answer]"

    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", "?")
        if dataset in ["cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_cruxeval) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_cruxeval) \
            .replace("$EXAMPLE_REASONING$", example_response_python_cruxeval) \
            .replace("$?$", "?")  
    return prompt 

def create_prompt_deepseekcoder(code, code_input, dataset, pl):
    prompt_role = "You are an AI programming assistant, utilizing the Deepseek Coder model, developed by Deepseek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer."
    template =  prompt_role + "\n" + "### Instruction\n" + "$PROMPT_INSTRUCTION$\n"  + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
    + "\n[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```\n"  \
    + "[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code \
    +  "\n" + "[Question]\n" + "$QUESTION$" + "```"+code_input + "```"+ "\n[Answer]\n### Response"

    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", "?")
        if dataset in ["cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_cruxeval) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_cruxeval) \
            .replace("$EXAMPLE_REASONING$", example_response_python_cruxeval) \
            .replace("$?$", "?")  
    return prompt 

def create_prompt_starcoder(code, code_input, dataset, pl):
    template =  "<fim_prefix><Instruction> " + "$PROMPT_INSTRUCTION$\n" + "</Instruction>\n" + "Below is an example:\n<Example>\nConsider the following code\n" + "$EXAMPLE_CODE$" \
    + "\n[Question]\n" + "$QUESTION$" + "```"+"$EXAMPLE_INPUT$" + "```\n"  \
    + "[Answer]\n" + "$EXAMPLE_REASONING$" + "\n</Example>\n" + "Consider the following code\n" + code \
    +  "\n" + "[Question]\n" + "$QUESTION$" + "```"+code_input + "```"+ "\n[Answer]\n<fim_suffix><fim_middle>"

    if pl == 'Java':
        prompt_instruction = instruction.format(language='Java')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_java) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_reasoning_java) \
            .replace("$?$", '')
    if pl == 'Python':
        prompt_instruction = instruction.format(language='Python')
        if dataset in ['CodeNet', 'Avatar']:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", '')
        if dataset in ["mbpp", "humaneval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_function) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_function) \
            .replace("$EXAMPLE_REASONING$", example_response_python) \
            .replace("$?$", "?")
        if dataset in ["cruxeval"]:
            prompt = template.replace("$PROMPT_INSTRUCTION$", prompt_instruction) \
            .replace("$EXAMPLE_CODE$", example_python_cruxeval) \
            .replace("$QUESTION$", question) \
            .replace("$EXAMPLE_INPUT$", example_input_cruxeval) \
            .replace("$EXAMPLE_REASONING$", example_response_python_cruxeval) \
            .replace("$?$", "?")  
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
    if "starcoder" in model_id:
        prompt = create_prompt_starcoder(code, code_input, dataset, pl)
    # if "WizardCoder" in model_id:
    #     prompt = create_prompt_wizardcoder(code, code_input, dataset, pl)
    return prompt
