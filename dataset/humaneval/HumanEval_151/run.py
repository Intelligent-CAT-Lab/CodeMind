from typing import *
def double_the_difference(lst):
    return sum([i**2 for i in lst if i > 0 and i%2!=0 and "." not in str(i)])

output = double_the_difference([0.2, 3, 5]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_151/output.txt", 'w')
file.write(str(output))
file.close()
    