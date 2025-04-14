from typing import *
def sort_array(arr):
    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))

output = sort_array([1,5,2,3,4]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_116/output.txt", 'w')
file.write(str(output))
file.close()
    