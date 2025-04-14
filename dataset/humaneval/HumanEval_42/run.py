from typing import *
def incr_list(l: list):
    return [(e + 1) for e in l]

output = incr_list([5, 2, 5, 2, 3, 3, 9, 0, 123]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_42/output.txt", 'w')
file.write(str(output))
file.close()
    