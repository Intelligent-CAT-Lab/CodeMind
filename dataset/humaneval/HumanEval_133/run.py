from typing import *
def sum_squares(lst):
    import math
    squared = 0
    for i in lst:
        squared += math.ceil(i)**2
    return squared

output = sum_squares([1,2,3])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_133/output.txt", 'w')
file.write(str(output))
file.close()
    