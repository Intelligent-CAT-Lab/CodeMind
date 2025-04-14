from typing import *
def get_positive(l: list):
    return [e for e in l if e > 0]

output = get_positive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_30__0/output.txt", 'w')
file.write(str(output))
file.close()
    