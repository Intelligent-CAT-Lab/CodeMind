from typing import *
def flip_case(string: str) -> str:
    return string.swapcase()

output = flip_case('Hello!') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_27/output.txt", 'w')
file.write(str(output))
file.close()
    