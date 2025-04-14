from typing import *
def f(n):
    ret = []
    for i in range(1,n+1):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

output = f(7)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_106__1/output.txt", 'w')
file.write(str(output))
file.close()
    