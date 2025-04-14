from typing import *
def search(lst):
    frq = [0] * (max(lst) + 1)
    for i in lst:
        frq[i] += 1;

    ans = -1
    for i in range(1, len(frq)):
        if frq[i] >= i:
            ans = i
    
    return ans

output = search([5, 5, 5, 5, 1]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_69/output.txt", 'w')
file.write(str(output))
file.close()
    