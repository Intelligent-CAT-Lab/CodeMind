from typing import *
def maximum(arr, k):
    if k == 0:
        return []
    arr.sort()
    ans = arr[-k:]
    return ans

output = maximum([123, -123, 20, 0 , 1, 2, -3], 3)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_120__1/output.txt", 'w')
file.write(str(output))
file.close()
    