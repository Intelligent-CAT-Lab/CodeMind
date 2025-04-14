from typing import *
def unique_digits(x):
    odd_digit_elements = []
    for i in x:
        if all (int(c) % 2 == 1 for c in str(i)):
            odd_digit_elements.append(i)
    return sorted(odd_digit_elements)

output = unique_digits([135, 103, 31])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_104__0/output.txt", 'w')
file.write(str(output))
file.close()
    