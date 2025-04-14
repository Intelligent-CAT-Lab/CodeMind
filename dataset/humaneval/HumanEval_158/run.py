from typing import *
def find_max(words):
    return sorted(words, key = lambda x: (-len(set(x)), x))[0]

output = find_max(["name", "of", "string"])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_158/output.txt", 'w')
file.write(str(output))
file.close()
    