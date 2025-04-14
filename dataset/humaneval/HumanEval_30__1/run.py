from typing import *
def get_positive(l: list):
    return [e for e in l if e > 0]

output = get_positive([-1, -2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_30__1/output.txt", 'w')
file.write(str(output))
file.close()
    