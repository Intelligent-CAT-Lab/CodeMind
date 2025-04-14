from typing import *
def get_positive(l: list):
    return [e for e in l if e > 0]

output = get_positive([-1, -2, 4, 5, 6]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_30/output.txt", 'w')
file.write(str(output))
file.close()
    