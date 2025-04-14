from typing import *
def next_smallest(lst):
    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]

output = next_smallest([1, 2, 3, 4, 5]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_90/output.txt", 'w')
file.write(str(output))
file.close()
    