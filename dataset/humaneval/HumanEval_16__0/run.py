from typing import *
def count_distinct_characters(string: str) -> int:
    return len(set(string.lower()))

output = count_distinct_characters('abcde')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_16__0/output.txt", 'w')
file.write(str(output))
file.close()
    