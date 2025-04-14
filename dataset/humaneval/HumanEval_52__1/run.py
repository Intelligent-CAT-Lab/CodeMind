from typing import *
def below_threshold(l: list, t: int):
    for e in l:
        if e >= t:
            return False
    return True

output = below_threshold([1, 20, 4, 10], 5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_52__1/output.txt", 'w')
file.write(str(output))
file.close()
    