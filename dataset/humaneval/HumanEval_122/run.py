from typing import *
def add_elements(arr, k):
    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)

output = add_elements([1,-2,-3,41,57,76,87,88,99], 3) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_122/output.txt", 'w')
file.write(str(output))
file.close()
    