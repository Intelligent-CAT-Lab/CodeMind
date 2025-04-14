from typing import *
def concatenate(strings: List[str]) -> str:
    return ''.join(strings)

output = concatenate([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_28__0/output.txt", 'w')
file.write(str(output))
file.close()
    