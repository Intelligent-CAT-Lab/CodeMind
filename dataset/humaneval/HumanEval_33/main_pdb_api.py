from typing import *	##line:(1)
def sort_third(l: list):	##line:(2)
    l = list(l)	##line:(3)
    l[::3] = sorted(l[::3])	##line:(4)
    return l	##line:(5)

tuple(sort_third([1, 2, 3])) 