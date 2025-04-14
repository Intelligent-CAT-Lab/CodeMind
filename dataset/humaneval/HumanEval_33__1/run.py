from typing import *
def sort_third(l: list):
    l = list(l)
    l[::3] = sorted(l[::3])
    return l

output = sort_third([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_33__1/output.txt", 'w')
file.write(str(output))
file.close()
    