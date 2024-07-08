from typing import *	##line:(1)
def median(l: list):	##line:(2)
    l = sorted(l)	##line:(3)
    if len(l) % 2 == 1:	##line:(4)
        return l[len(l) // 2]	##line:(5)
    else:	##line:(6)
        return (l[len(l) // 2 - 1] + l[len(l) // 2]) / 2.0	##line:(7)

median([3, 1, 2, 4, 5]) 