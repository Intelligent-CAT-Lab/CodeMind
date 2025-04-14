from typing import *
def next_smallest(lst):
    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]

output = next_smallest([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_90__1/output.txt", 'w')
file.write(str(output))
file.close()
    