from typing import *
def right_angle_triangle(a, b, c):
    return a*a == b*b + c*c or b*b == a*a + c*c or c*c == a*a + b*b

output = right_angle_triangle(7, 24, 25)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_157__0/output.txt", 'w')
file.write(str(output))
file.close()
    