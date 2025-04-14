from typing import *
def is_multiply_prime(a):
    def is_prime(n):
        for j in range(2,n):
            if n%j == 0:
                return False
        return True

    for i in range(2,101):
        if not is_prime(i): continue
        for j in range(2,101):
            if not is_prime(j): continue
            for k in range(2,101):
                if not is_prime(k): continue
                if i*j*k == a: return True
    return False

output = is_multiply_prime(125)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_75__1/output.txt", 'w')
file.write(str(output))
file.close()
    