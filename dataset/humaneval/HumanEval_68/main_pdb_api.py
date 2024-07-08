from typing import *	##line:(1)
def pluck(arr):	##line:(2)
    if(len(arr) == 0): return []	##line:(3)
    evens = list(filter(lambda x: x%2 == 0, arr))	##line:(4)
    if(evens == []): return []	##line:(5)
    return [min(evens), arr.index(min(evens))]	##line:(6)

pluck([4,2,3]) 