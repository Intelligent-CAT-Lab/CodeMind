from typing import *
def sum_squares(lst):
    result =[]
    for i in range(len(lst)):
        if i %3 == 0:
            result.append(lst[i]**2)
        elif i % 4 == 0 and i%3 != 0:
            result.append(lst[i]**3)
        else:
            result.append(lst[i])
    return sum(result)

output = sum_squares([1,2,3]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_142/output.txt", 'w')
file.write(str(output))
file.close()
    