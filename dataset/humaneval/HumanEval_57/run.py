from typing import *
def monotonic(l: list):
    if l == sorted(l) or l == sorted(l, reverse=True):
        return True
    return False

output = monotonic([1, 2, 4, 10]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_57/output.txt", 'w')
file.write(str(output))
file.close()
    