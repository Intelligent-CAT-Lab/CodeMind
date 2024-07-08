from typing import *	##line:(1)
def next_smallest(lst):	##line:(2)
    lst = sorted(set(lst))	##line:(3)
    return None if len(lst) < 2 else lst[1]	##line:(4)

next_smallest([1, 2, 3, 4, 5]) 