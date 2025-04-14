from typing import *
def get_row(lst, x):
    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0])

output = get_row([[], [1], [1, 2, 3]], 3)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_87__1/output.txt", 'w')
file.write(str(output))
file.close()
    