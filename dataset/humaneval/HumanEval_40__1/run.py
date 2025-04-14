from typing import *
def triples_sum_to_zero(l: list):
    for i in range(len(l)):
        for j in range(i + 1, len(l)):
            for k in range(j + 1, len(l)):
                if l[i] + l[j] + l[k] == 0:
                    return True
    return False

output = triples_sum_to_zero([2, 4, -5, 3, 9, 7])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_40__1/output.txt", 'w')
file.write(str(output))
file.close()
    