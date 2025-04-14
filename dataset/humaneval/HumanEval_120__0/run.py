from typing import *
def maximum(arr, k):
    if k == 0:
        return []
    arr.sort()
    ans = arr[-k:]
    return ans

output = maximum([-3, 2, 1, 2, -1, -2, 1], 1)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_120__0/output.txt", 'w')
file.write(str(output))
file.close()
    