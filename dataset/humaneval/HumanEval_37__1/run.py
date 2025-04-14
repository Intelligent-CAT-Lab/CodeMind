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

output = sort_even([1, 2, 3])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_37__1/output.txt", 'w')
file.write(str(output))
file.close()
    