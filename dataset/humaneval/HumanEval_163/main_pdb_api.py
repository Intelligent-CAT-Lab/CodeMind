from typing import *	##line:(1)
def generate_integers(a, b):	##line:(2)
    lower = max(2, min(a, b))	##line:(3)
    upper = min(8, max(a, b))	##line:(4)
	##line:(5)
    return [i for i in range(lower, upper+1) if i % 2 == 0]	##line:(6)

generate_integers(2, 10) 