from typing import *
def strlen(string: str) -> int:
    return len(string)

output = strlen('asdasnakj') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_23/output.txt", 'w')
file.write(str(output))
file.close()
    