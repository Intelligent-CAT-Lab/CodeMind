from typing import *
def iscube(a):
    a = abs(a)
    return int(round(a ** (1. / 3))) ** 3 == a

output = iscube(2)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_77__0/output.txt", 'w')
file.write(str(output))
file.close()
    