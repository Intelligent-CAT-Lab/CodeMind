from typing import *
import math

def poly(xs: list, x: float):
    return sum([coeff * math.pow(x, i) for i, coeff in enumerate(xs)])

def find_zero(xs: list):
    begin, end = -1., 1.
    while poly(xs, begin) * poly(xs, end) > 0:
        begin *= 2.0
        end *= 2.0
    while end - begin > 1e-10:
        center = (begin + end) / 2.0
        if poly(xs, center) * poly(xs, begin) > 0:
            begin = center
        else:
            end = center
    return begin
output = find_zero([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_32__1/output.txt", 'w')
file.write(str(output))
file.close()
    