from typing import *
def is_sorted(lst):
    count_digit = dict([(i, 0) for i in lst])
    for i in lst:
        count_digit[i]+=1 
    if any(count_digit[i] > 2 for i in lst):
        return False
    if all(lst[i-1] <= lst[i] for i in range(1, len(lst))):
        return True
    else:
        return False
    
    

output = is_sorted([1, 2, 3, 4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_126__0/output.txt", 'w')
file.write(str(output))
file.close()
    