from typing import *
def prime_length(string):
    l = len(string)
    if l == 0 or l == 1:
        return False
    for i in range(2, l):
        if l % i == 0:
            return False
    return True

output = prime_length('Wow')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_82__0/output.txt", 'w')
file.write(str(output))
file.close()
    