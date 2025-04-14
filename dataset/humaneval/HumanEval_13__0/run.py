from typing import *
def greatest_common_divisor(a: int, b: int) -> int:
    while b:
        a, b = b, a % b
    return a

output = greatest_common_divisor(10, 15)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_13__0/output.txt", 'w')
file.write(str(output))
file.close()
    