from typing import *
def unique(l: list):
    return sorted(list(set(l)))

output = unique([2, 1, 1, 2, 1, 1])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_34__1/output.txt", 'w')
file.write(str(output))
file.close()
    