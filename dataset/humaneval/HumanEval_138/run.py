from typing import *
def is_equal_to_sum_even(n):
    return n%2 == 0 and n >= 8

output = is_equal_to_sum_even(4) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_138/output.txt", 'w')
file.write(str(output))
file.close()
    