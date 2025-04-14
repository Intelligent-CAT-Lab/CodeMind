from typing import *
def count_distinct_characters(string: str) -> int:
    return len(set(string.lower()))

output = count_distinct_characters('aaaaAAAAaaaa')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_16__1/output.txt", 'w')
file.write(str(output))
file.close()
    