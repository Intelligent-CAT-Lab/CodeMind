from typing import *
def truncate_number(number: float) -> float:
    return number % 1.0

output = truncate_number(1.33)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_2__1/output.txt", 'w')
file.write(str(output))
file.close()
    