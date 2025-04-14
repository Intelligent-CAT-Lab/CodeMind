from typing import *
def right_angle_triangle(a, b, c):
    return a*a == b*b + c*c or b*b == a*a + c*c or c*c == a*a + b*b

output = right_angle_triangle(3, 4, 5) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_157/output.txt", 'w')
file.write(str(output))
file.close()
    