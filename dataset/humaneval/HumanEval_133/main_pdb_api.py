from typing import *	##line:(1)
def sum_squares(lst):	##line:(2)
    import math	##line:(3)
    squared = 0	##line:(4)
    for i in lst:	##line:(5)
        squared += math.ceil(i)**2	##line:(6)
    return squared	##line:(7)

sum_squares([1,2,3])