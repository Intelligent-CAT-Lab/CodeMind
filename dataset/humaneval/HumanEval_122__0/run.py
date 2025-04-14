from typing import *
def add_elements(arr, k):
    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)

output = add_elements([111,21,3,4000,5,6,7,8,9], 4)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_122__0/output.txt", 'w')
file.write(str(output))
file.close()
    