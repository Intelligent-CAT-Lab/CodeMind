from typing import *	##line:(1)
def maximum(arr, k):	##line:(2)
    if k == 0:	##line:(3)
        return []	##line:(4)
    arr.sort()	##line:(5)
    ans = arr[-k:]	##line:(6)
    return ans	##line:(7)

maximum([-3, -4, 5], 3) 