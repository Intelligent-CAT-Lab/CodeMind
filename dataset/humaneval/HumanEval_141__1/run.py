from typing import *
def file_name_check(file_name):
    suf = ['txt', 'exe', 'dll']
    lst = file_name.split(sep='.')
    if len(lst) != 2:
        return 'No'
    if not lst[1] in suf:
        return 'No'
    if len(lst[0]) == 0:
        return 'No'
    if not lst[0][0].isalpha():
        return 'No'
    t = len([x for x in lst[0] if x.isdigit()])
    if t > 3:
        return 'No'
    return 'Yes'

output = file_name_check('@this1_is6_valid.exe')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_141__1/output.txt", 'w')
file.write(str(output))
file.close()
    