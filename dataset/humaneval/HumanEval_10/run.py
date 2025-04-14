from typing import *
def is_palindrome(string: str) -> bool:
    if not string:
        return ''

    beginning_of_suffix = 0

    while not is_palindrome(string[beginning_of_suffix:]):
        beginning_of_suffix += 1

    return string + string[:beginning_of_suffix][::-1]

output = is_palindrome('jerry') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_10/output.txt", 'w')
file.write(str(output))
file.close()
    