from typing import *
def median(l: list):
    l = sorted(l)
    if len(l) % 2 == 1:
        return l[len(l) // 2]
    else:
        return (l[len(l) // 2 - 1] + l[len(l) // 2]) / 2.0

output = median([8, 1, 3, 9, 9, 2, 7])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_47__0/output.txt", 'w')
file.write(str(output))
file.close()
    