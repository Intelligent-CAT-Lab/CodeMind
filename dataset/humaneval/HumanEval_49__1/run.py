from typing import *
def modp(n: int, p: int):
    ret = 1
    for i in range(n):
        ret = (2 * ret) % p
    return ret

output = modp(0, 101)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_49__1/output.txt", 'w')
file.write(str(output))
file.close()
    