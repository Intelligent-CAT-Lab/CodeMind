import sys
sys.path.append("../")

from utils import Model, Dataset, PromptType

GPT_Java_CodeNet = PromptType(
    models = [Model.CodeQwen, Model.CodeQwenBase],
    datasets = [Dataset.CodeNetJava, Dataset.AvatarJava],
    prompt_text = """<Instruction>
I want you to act as a Java code executor. I will give you a piece of Java code and its input. You need to think step by step and then print the output of code execution.
</Instruction>
Below is an example:
<Example>
Consider the following code:
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
[Question]
What would be the output of code execution given the following input:
```20 2 5```
First analyze step by step about how the code processes the input to generate the output. 
Then print the output of the code based on your analysis.

Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
<<<Analysis>>>
The variable n, variable a and variable b are initialized with 20, 2 and 5 respectively according to the input. And variable sum is initialized with 0.
It enters a for loop and it iterates from 1 to 20 to check each integer i in this range. The value of variable i is also passed to variable num.
Inside the for loop, it calculates the sum of the digits of the current interger num by repeatedlly extracting the digits of number with a while loop and adding it to variable sum.
Then it checks if the calculated variable sum falls within the range [2, 5]. If it does, it adds the current interger i to variable answer. The condition is met when i is 2,3,4,5,11,12,13,14 and 20.
After the loop finishes, it print the fianl value of variable answer as output, which is 84.
<<<Output>>>
84
[END-OF-RESPONSE]
</Example>

Consider the following code:
CODE_PLACEHOLDER

[Question]
What would be the output of code executiion given the following input:
`INPUT_PLACEHOLDER`
First analyze step by step about how the code processes the input to generate the output.
Then print the output of the code based on your analysis.
Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
"""
)

GPT_Python_CodeNet = PromptType(
    models = [Model.CodeQwen, Model.CodeQwenBase],
    datasets = [Dataset.CodeNetPython, Dataset.AvatarPython],
    prompt_text = """<Instruction>
I want you to act as a Python code executor. I will give you a piece of Python code and its input. You need to think step by step and then print the output of code execution.
</Instruction>
Below is an example:
<Example>
Consider the following code:
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
[Question]
What would be the output of code execution given the following input:
```20 2 5```
First analyze step by step about how the code processes the input to generate the output. 
Then print the output of the code based on your analysis.

Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
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
</Example>

Consider the following code:
CODE_PLACEHOLDER

[Question]
What would be the output of code executiion given the following input:
`INPUT_PLACEHOLDER`
First analyze step by step about how the code processes the input to generate the output.
Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
"""
)


GPT_Python_MBPP = PromptType(
    models = [Model.CodeQwen, Model.CodeQwenBase],
    datasets = [Dataset.MBPP, Dataset.HumanEval],
    prompt_text = """<Instruction>
I want you to act as a Python code executor. I will give you a piece of Python code and its input. You need to think step by step and then print the output of code execution.
</Instruction>
Below is an example:
<Example>
Consider the following code:
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
    
[Question]
What would be the return value of `sum_of_integer(20, 2, 5)`? 
First analyze step by step about how the code processes the input to generate the output. 
Then print the output of the code based on your analysis.

Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
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
</Example>

Consider the following code:
CODE_PLACEHOLDER

[Question]
What would be the return value of `INPUT_PLACEHOLDER`?
First analyze step by step about how the code processes the input to generate the output.
Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
"""
)


GPT_Python_CruxEval = PromptType(
    models = [Model.CodeQwen, Model.CodeQwenBase],
    datasets = [Dataset.CruxEval],
    prompt_text = """<Instruction>
I want you to act as a Python code executor. I will give you a piece of Python code and its input. You need to think step by step and then print the output of code execution.
</Instruction>
Below is an example:
<Example>
Consider the following code:
def f(N, A, B):
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
    
[Question]
What would be the return value of `f(20, 2, 5)`? 
First analyze step by step about how the code processes the input to generate the output. 
Then print the output of the code based on your analysis.

Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
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
</Example>

Consider the following code:
CODE_PLACEHOLDER

[Question]
What would be the return value of `INPUT_PLACEHOLDER`?
First analyze step by step about how the code processes the input to generate the output.
Follow the following format:
<<<Analysis>>>
{YOUR ANALYSIS}
<<<Output>>>
{OUTPUT}
[END-OF-RESPONSE]

[Answer]
"""
)