from typing import *
def add_elements(arr, k):
    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)

output = add_elements([11,21,3,90,5,6,7,8,9], 4)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_122__1/output.txt", 'w')
file.write(str(output))
file.close()
    