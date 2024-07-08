from typing import *	##line:(1)
def monotonic(l: list):	##line:(2)
    if l == sorted(l) or l == sorted(l, reverse=True):	##line:(3)
        return True	##line:(4)
    return False	##line:(5)

monotonic([1, 2, 4, 10]) 