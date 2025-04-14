from typing import *
def compare(game,guess):
    return [abs(x-y) for x,y in zip(game,guess)]

output = compare([1,2,3,5],[-1,2,3,4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_152__0/output.txt", 'w')
file.write(str(output))
file.close()
    