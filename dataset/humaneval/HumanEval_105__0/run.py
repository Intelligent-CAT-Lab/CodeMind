from typing import *
def by_length(arr):
    dic = {
        1: "One",
        2: "Two",
        3: "Three",
        4: "Four",
        5: "Five",
        6: "Six",
        7: "Seven",
        8: "Eight",
        9: "Nine",
    }
    sorted_arr = sorted(arr, reverse=True)
    new_arr = []
    for var in sorted_arr:
        try:
            new_arr.append(dic[var])
        except:
            pass
    return new_arr

output = by_length([1, -1, 3, 2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_105__0/output.txt", 'w')
file.write(str(output))
file.close()
    