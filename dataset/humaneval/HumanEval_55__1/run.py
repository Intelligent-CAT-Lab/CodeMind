from typing import *
def fib(n: int):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fib(n - 1) + fib(n - 2)

output = fib(11)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_55__1/output.txt", 'w')
file.write(str(output))
file.close()
    