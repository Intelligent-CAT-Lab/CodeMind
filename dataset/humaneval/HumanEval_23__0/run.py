from typing import *
def strlen(string: str) -> int:
    return len(string)

output = strlen('x')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_23__0/output.txt", 'w')
file.write(str(output))
file.close()
    