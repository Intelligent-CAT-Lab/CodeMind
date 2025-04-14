from typing import *
def how_many_times(string: str, substring: str) -> int:
    times = 0

    for i in range(len(string) - len(substring) + 1):
        if string[i:i+len(substring)] == substring:
            times += 1

    return times

output = how_many_times('xyxyxyx', 'x')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_18__0/output.txt", 'w')
file.write(str(output))
file.close()
    