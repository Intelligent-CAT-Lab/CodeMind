from typing import *
def unique(l: list):
    return sorted(list(set(l)))

output = unique([5, 3, 5, 2, 3, 3, 9, 0, 123]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_34/output.txt", 'w')
file.write(str(output))
file.close()
    