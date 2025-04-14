from typing import *
def sort_even(l: list):
    evens = l[::2]
    odds = l[1::2]
    evens.sort()
    ans = []
    for e, o in zip(evens, odds):
        ans.extend([e, o])
    if len(evens) > len(odds):
        ans.append(evens[-1])
    return ans

output = sort_even([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_37__0/output.txt", 'w')
file.write(str(output))
file.close()
    