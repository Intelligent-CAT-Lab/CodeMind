from typing import *
def sort_array(array):
    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 

output = sort_array([5])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_88__1/output.txt", 'w')
file.write(str(output))
file.close()
    