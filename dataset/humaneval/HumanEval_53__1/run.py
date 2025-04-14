from typing import *
def add(x: int, y: int):
    return x + y

output = add(6, 8)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_53__1/output.txt", 'w')
file.write(str(output))
file.close()
    