from typing import *
def multiply(a, b):
    return abs(a % 10) * abs(b % 10)

output = multiply(76, 67)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_97__1/output.txt", 'w')
file.write(str(output))
file.close()
    