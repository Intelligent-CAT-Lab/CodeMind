from typing import *
def strange_sort_list(lst):
    res, switch = [], True
    while lst:
        res.append(min(lst) if switch else max(lst))
        lst.remove(res[-1])
        switch = not switch
    return res

output = strange_sort_list([111111])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_70__1/output.txt", 'w')
file.write(str(output))
file.close()
    