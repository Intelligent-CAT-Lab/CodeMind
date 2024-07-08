from typing import *	##line:(1)
def prod_signs(arr):	##line:(2)
    if not arr: return None	##line:(3)
    prod = 0 if 0 in arr else (-1) ** len(list(filter(lambda x: x < 0, arr)))	##line:(4)
    return prod * sum([abs(i) for i in arr])	##line:(5)

prod_signs([1, 2, 2, -4]) 