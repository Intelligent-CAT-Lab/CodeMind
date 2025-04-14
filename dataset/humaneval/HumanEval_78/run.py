from typing import *
def hex_key(num):
    primes = ('2', '3', '5', '7', 'B', 'D')
    total = 0
    for i in range(0, len(num)):
        if num[i] in primes:
            total += 1
    return total

output = hex_key("AB") 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_78/output.txt", 'w')
file.write(str(output))
file.close()
    