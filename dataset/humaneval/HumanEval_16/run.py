from typing import *
def count_distinct_characters(string: str) -> int:
    return len(set(string.lower()))

output = count_distinct_characters('abcde' + 'cade' + 'CADE') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_16/output.txt", 'w')
file.write(str(output))
file.close()
    