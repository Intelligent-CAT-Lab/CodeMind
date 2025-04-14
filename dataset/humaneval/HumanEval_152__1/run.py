from typing import *
def compare(game,guess):
    return [abs(x-y) for x,y in zip(game,guess)]

output = compare([0,0,0,0,0,0],[0,0,0,0,0,0])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_152__1/output.txt", 'w')
file.write(str(output))
file.close()
    