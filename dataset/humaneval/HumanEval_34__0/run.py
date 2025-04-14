from typing import *
def unique(l: list):
    return sorted(list(set(l)))

output = unique(['a', 'b', 'b', 'c', 'd', 'd'])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_34__0/output.txt", 'w')
file.write(str(output))
file.close()
    