from typing import *
def cycpattern_check(a , b):
    l = len(b)
    pat = b + b
    for i in range(len(a) - l + 1):
        for j in range(l + 1):
            if a[i:i+l] == pat[j:j+l]:
                return True
    return False

output =  cycpattern_check("xyzw","xyw") 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_154/output.txt", 'w')
file.write(str(output))
file.close()
    