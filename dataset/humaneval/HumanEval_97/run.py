from typing import *
def multiply(a, b):
    return abs(a % 10) * abs(b % 10)

output = multiply(148, 412) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_97/output.txt", 'w')
file.write(str(output))
file.close()
    