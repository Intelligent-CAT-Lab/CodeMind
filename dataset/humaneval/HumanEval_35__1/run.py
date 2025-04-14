from typing import *
def max_element(l: list):
    m = l[0]
    for e in l:
        if e > m:
            m = e
    return m

output = max_element([3, 2, -3.5, 0])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_35__1/output.txt", 'w')
file.write(str(output))
file.close()
    