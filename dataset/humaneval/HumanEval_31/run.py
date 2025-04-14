from typing import *
def is_prime(n):
    if n < 2:
        return False
    for k in range(2, n - 1):
        if n % k == 0:
            return False
    return True

output = is_prime(6) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_31/output.txt", 'w')
file.write(str(output))
file.close()
    