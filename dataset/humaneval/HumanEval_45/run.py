from typing import *
def triangle_area(a, h):
    return a * h / 2.0

output = triangle_area(5, 3) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_45/output.txt", 'w')
file.write(str(output))
file.close()
    