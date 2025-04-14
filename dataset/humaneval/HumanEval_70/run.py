from typing import *
def strange_sort_list(lst):
    res, switch = [], True
    while lst:
        res.append(min(lst) if switch else max(lst))
        lst.remove(res[-1])
        switch = not switch
    return res

output = strange_sort_list([1, 2, 3, 4]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_70/output.txt", 'w')
file.write(str(output))
file.close()
    