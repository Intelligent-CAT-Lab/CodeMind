from typing import *
def correct_bracketing(brackets: str):
    depth = 0
    for b in brackets:
        if b == "<":
            depth += 1
        else:
            depth -= 1
        if depth < 0:
            return False
    return depth == 0

output = correct_bracketing("<<><>>") 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_56/output.txt", 'w')
file.write(str(output))
file.close()
    