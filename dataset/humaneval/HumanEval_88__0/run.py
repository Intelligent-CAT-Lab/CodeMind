from typing import *
def sort_array(array):
    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 

output = sort_array([2, 4, 3, 0, 1, 5, 6])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_88__0/output.txt", 'w')
file.write(str(output))
file.close()
    