from typing import *
def solve(N):
    return bin(sum(int(i) for i in str(N)))[2:]

output = solve(963)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_84__0/output.txt", 'w')
file.write(str(output))
file.close()
    