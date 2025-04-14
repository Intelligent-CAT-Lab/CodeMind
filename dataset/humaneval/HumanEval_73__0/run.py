from typing import *
def smallest_change(arr):
    ans = 0
    for i in range(len(arr) // 2):
        if arr[i] != arr[len(arr) - i - 1]:
            ans += 1
    return ans

output = smallest_change([1, 4, 2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_73__0/output.txt", 'w')
file.write(str(output))
file.close()
    