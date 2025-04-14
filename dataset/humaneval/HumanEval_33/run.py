from typing import *
def sort_third(l: list):
    l = list(l)
    l[::3] = sorted(l[::3])
    return l

output = tuple(sort_third([1, 2, 3])) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_33/output.txt", 'w')
file.write(str(output))
file.close()
    