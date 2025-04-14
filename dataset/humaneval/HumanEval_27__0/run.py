from typing import *
def flip_case(string: str) -> str:
    return string.swapcase()

output = flip_case('')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_27__0/output.txt", 'w')
file.write(str(output))
file.close()
    