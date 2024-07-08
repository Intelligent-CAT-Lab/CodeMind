from typing import *	##line:(1)
def get_positive(l: list):	##line:(2)
    return [e for e in l if e > 0]	##line:(3)

get_positive([-1, -2, 4, 5, 6]) 