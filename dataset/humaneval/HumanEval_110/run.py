from typing import *
def exchange(lst1, lst2):
    odd = 0
    even = 0
    for i in lst1:
        if i%2 == 1:
            odd += 1
    for i in lst2:
        if i%2 == 0:
            even += 1
    if even >= odd:
        return "YES"
    return "NO"
            

output = exchange([1, 2, 3, 4], [1, 2, 3, 4]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_110/output.txt", 'w')
file.write(str(output))
file.close()
    