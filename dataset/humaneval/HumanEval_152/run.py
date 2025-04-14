from typing import *
def compare(game,guess):
    return [abs(x-y) for x,y in zip(game,guess)]

output = compare([1,2,3,4,5,1],[1,2,3,4,2,-2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_152/output.txt", 'w')
file.write(str(output))
file.close()
    