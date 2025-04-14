from typing import *
def monotonic(l: list):
    if l == sorted(l) or l == sorted(l, reverse=True):
        return True
    return False

output = monotonic([4, 1, 0, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_57__0/output.txt", 'w')
file.write(str(output))
file.close()
    