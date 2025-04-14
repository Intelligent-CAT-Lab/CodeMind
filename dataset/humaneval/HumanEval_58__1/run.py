from typing import *
def common(l1: list, l2: list):
    ret = set()
    for e1 in l1:
        for e2 in l2:
            if e1 == e2:
                ret.add(e1)
    return sorted(list(ret))

output = common([5, 3, 2, 8], [3, 2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_58__1/output.txt", 'w')
file.write(str(output))
file.close()
    