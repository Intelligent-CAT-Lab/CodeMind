from typing import *
def truncate_number(number: float) -> float:
    return number % 1.0

output = truncate_number(3.5) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_2/output.txt", 'w')
file.write(str(output))
file.close()
    