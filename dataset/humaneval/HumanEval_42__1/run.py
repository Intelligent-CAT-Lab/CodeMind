from typing import *
def incr_list(l: list):
    return [(e + 1) for e in l]

output = incr_list([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_42__1/output.txt", 'w')
file.write(str(output))
file.close()
    