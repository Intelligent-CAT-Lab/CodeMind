from typing import *
def x_or_y(n, x, y):
    if n == 1:
        return y
    for i in range(2, n):
        if n % i == 0:
            return y
            break
    else:
        return x

output = x_or_y(91, 56, 129)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_150__1/output.txt", 'w')
file.write(str(output))
file.close()
    