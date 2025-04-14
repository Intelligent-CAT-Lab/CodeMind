from typing import *
def total_match(lst1, lst2):
    l1 = 0
    for st in lst1:
        l1 += len(st)
    
    l2 = 0
    for st in lst2:
        l2 += len(st)
    
    if l1 <= l2:
        return lst1
    else:
        return lst2

output = total_match(['4'], ['1', '2', '3', '4', '5'])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_74__0/output.txt", 'w')
file.write(str(output))
file.close()
    