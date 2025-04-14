from typing import *
def get_odd_collatz(n):
    if n%2==0:
        odd_collatz = [] 
    else:
        odd_collatz = [n]
    while n > 1:
        if n % 2 == 0:
            n = n/2
        else:
            n = n*3 + 1
            
        if n%2 == 1:
            odd_collatz.append(int(n))

    return sorted(odd_collatz)

output = get_odd_collatz(5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_123__1/output.txt", 'w')
file.write(str(output))
file.close()
    