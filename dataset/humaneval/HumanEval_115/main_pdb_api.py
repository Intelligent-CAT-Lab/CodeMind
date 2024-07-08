from typing import *	##line:(1)
import math	##line:(2)
def max_fill(grid, capacity):	##line:(3)
    return sum([math.ceil(sum(arr)/capacity) for arr in grid])	##line:(4)

max_fill([[0,0,1,0], [0,1,0,0], [1,1,1,1]], 1) 