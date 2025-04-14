from typing import *
def same_chars(s0: str, s1: str):
    return set(s0) == set(s1)

output = same_chars('abcd', 'dddddddabcf')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_54__0/output.txt", 'w')
file.write(str(output))
file.close()
    