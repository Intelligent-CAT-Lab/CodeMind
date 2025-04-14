from typing import *
def triangle_area(a, b, c):
    if a + b <= c or a + c <= b or b + c <= a:
        return -1 
    s = (a + b + c)/2    
    area = (s * (s - a) * (s - b) * (s - c)) ** 0.5
    area = round(area, 2)
    return area

output = triangle_area(1, 2, 10)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_71__1/output.txt", 'w')
file.write(str(output))
file.close()
    