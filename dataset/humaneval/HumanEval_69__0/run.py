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

output = search([2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_69__0/output.txt", 'w')
file.write(str(output))
file.close()
    