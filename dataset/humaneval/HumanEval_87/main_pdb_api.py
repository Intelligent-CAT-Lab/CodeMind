from typing import *	##line:(1)
def get_row(lst, x):	##line:(2)
    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]	##line:(3)
    return sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0])	##line:(4)

get_row([], 1) 