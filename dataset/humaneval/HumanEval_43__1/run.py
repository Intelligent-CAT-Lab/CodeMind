from typing import *
def pairs_sum_to_zero(l):
    for i, l1 in enumerate(l):
        for j in range(i + 1, len(l)):
            if l1 + l[j] == 0:
                return True
    return False

output = pairs_sum_to_zero([-3, 9, -1, 3, 2, 31])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_43__1/output.txt", 'w')
file.write(str(output))
file.close()
    