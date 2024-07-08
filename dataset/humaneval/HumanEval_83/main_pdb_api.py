from typing import *	##line:(1)
def starts_one_ends(n):	##line:(2)
    if n == 1: return 1	##line:(3)
    return 18 * (10 ** (n - 2))	##line:(4)

starts_one_ends(1) 