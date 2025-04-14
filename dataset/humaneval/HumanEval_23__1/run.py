from typing import *
def strlen(string: str) -> int:
    return len(string)

output = strlen('')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_23__1/output.txt", 'w')
file.write(str(output))
file.close()
    