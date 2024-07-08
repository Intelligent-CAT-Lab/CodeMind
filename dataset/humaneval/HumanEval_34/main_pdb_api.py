from typing import *	##line:(1)
def unique(l: list):	##line:(2)
    return sorted(list(set(l)))	##line:(3)

unique([5, 3, 5, 2, 3, 3, 9, 0, 123]) 