from typing import *
def rounded_avg(n, m):
    if m < n:
        return -1
    summation = 0
    for i in range(n, m+1):
        summation += i
    return bin(round(summation/(m - n + 1)))

output = rounded_avg(560,851)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_103__0/output.txt", 'w')
file.write(str(output))
file.close()
    