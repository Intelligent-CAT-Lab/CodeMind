from typing import *
def pluck(arr):
    if(len(arr) == 0): return []
    evens = list(filter(lambda x: x%2 == 0, arr))
    if(evens == []): return []
    return [min(evens), arr.index(min(evens))]

output = pluck([4,2,3]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_68/output.txt", 'w')
file.write(str(output))
file.close()
    