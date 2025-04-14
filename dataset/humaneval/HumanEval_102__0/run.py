from typing import *
def choose_num(x, y):
    if x > y:
        return -1
    if y % 2 == 0:
        return y
    if x == y:
        return -1
    return y - 1

output = choose_num(13, 12)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_102__0/output.txt", 'w')
file.write(str(output))
file.close()
    