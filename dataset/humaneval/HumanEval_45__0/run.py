from typing import *
def triangle_area(a, h):
    return a * h / 2.0

output = triangle_area(10, 8)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_45__0/output.txt", 'w')
file.write(str(output))
file.close()
    