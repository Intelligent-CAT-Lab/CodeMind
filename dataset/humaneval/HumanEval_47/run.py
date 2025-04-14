from typing import *
def median(l: list):
    l = sorted(l)
    if len(l) % 2 == 1:
        return l[len(l) // 2]
    else:
        return (l[len(l) // 2 - 1] + l[len(l) // 2]) / 2.0

output = median([3, 1, 2, 4, 5]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_47/output.txt", 'w')
file.write(str(output))
file.close()
    