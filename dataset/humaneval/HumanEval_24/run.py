from typing import *
def largest_divisor(n: int) -> int:
    for i in reversed(range(n)):
        if n % i == 0:
            return i

output = largest_divisor(3) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_24/output.txt", 'w')
file.write(str(output))
file.close()
    