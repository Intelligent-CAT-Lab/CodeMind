from typing import *
import math
def max_fill(grid, capacity):
    return sum([math.ceil(sum(arr)/capacity) for arr in grid])

output = max_fill([[1,1,1,1], [1,1,1,1]], 2)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_115__1/output.txt", 'w')
file.write(str(output))
file.close()
    