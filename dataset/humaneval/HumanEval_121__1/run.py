from typing import *
def solution(lst):
    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])

output = solution([30, 13, 23, 32])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_121__1/output.txt", 'w')
file.write(str(output))
file.close()
    