from typing import *
def below_threshold(l: list, t: int):
    for e in l:
        if e >= t:
            return False
    return True

output = below_threshold([1, 8, 4, 10], 11)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_52__0/output.txt", 'w')
file.write(str(output))
file.close()
    