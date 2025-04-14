from typing import *
def add(x: int, y: int):
    return x + y

output = add(7, 5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_53__0/output.txt", 'w')
file.write(str(output))
file.close()
    