from typing import *	##line:(1)
def incr_list(l: list):	##line:(2)
    return [(e + 1) for e in l]	##line:(3)

incr_list([5, 2, 5, 2, 3, 3, 9, 0, 123]) 