from typing import *
def will_it_fly(q,w):
    if sum(q) > w:
        return False

    i, j = 0, len(q)-1
    while i<j:
        if q[i] != q[j]:
            return False
        i+=1
        j-=1
    return True

output = will_it_fly([1, 2, 3], 6)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_72__1/output.txt", 'w')
file.write(str(output))
file.close()
    