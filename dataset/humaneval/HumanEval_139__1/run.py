from typing import *
def special_factorial(n):
    fact_i = 1
    special_fact = 1
    for i in range(1, n+1):
        fact_i *= i
        special_fact *= fact_i
    return special_fact

output = special_factorial(5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_139__1/output.txt", 'w')
file.write(str(output))
file.close()
    