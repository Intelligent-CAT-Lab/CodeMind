from typing import *
def sort_third(l: list):
    l = list(l)
    l[::3] = sorted(l[::3])
    return l

output = sort_third([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_33__0/output.txt", 'w')
file.write(str(output))
file.close()
    