from typing import *
def maximum(arr, k):
    if k == 0:
        return []
    arr.sort()
    ans = arr[-k:]
    return ans

output = maximum([-3, -4, 5], 3) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_120/output.txt", 'w')
file.write(str(output))
file.close()
    