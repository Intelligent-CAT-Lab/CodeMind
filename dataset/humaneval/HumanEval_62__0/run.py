from typing import *
def derivative(xs: list):
    return [(i * x) for i, x in enumerate(xs)][1:]

output = derivative([1])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_62__0/output.txt", 'w')
file.write(str(output))
file.close()
    