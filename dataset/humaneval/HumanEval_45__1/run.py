from typing import *
def triangle_area(a, h):
    return a * h / 2.0

output = triangle_area(2, 2)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_45__1/output.txt", 'w')
file.write(str(output))
file.close()
    