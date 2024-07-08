from typing import *	##line:(1)
def derivative(xs: list):	##line:(2)
    return [(i * x) for i, x in enumerate(xs)][1:]	##line:(3)

derivative([3, 1, 2, 4, 5]) 