from typing import *
def same_chars(s0: str, s1: str):
    return set(s0) == set(s1)

output = same_chars('eabcd', 'dddddddabc')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_54__1/output.txt", 'w')
file.write(str(output))
file.close()
    