from typing import *
def add(lst):
    return sum([lst[i] for i in range(1, len(lst), 2) if lst[i]%2 == 0])

output = add([4, 4, 6, 8])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_85__1/output.txt", 'w')
file.write(str(output))
file.close()
    