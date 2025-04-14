from typing import *
def sorted_list_sum(lst):
    lst.sort()
    new_lst = []
    for i in lst:
        if len(i)%2 == 0:
            new_lst.append(i)
    return sorted(new_lst, key=len)

output = sorted_list_sum(["aa", "a", "aaa"]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_149/output.txt", 'w')
file.write(str(output))
file.close()
    