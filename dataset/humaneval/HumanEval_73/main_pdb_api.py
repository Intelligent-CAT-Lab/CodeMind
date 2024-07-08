from typing import *	##line:(1)
def smallest_change(arr):	##line:(2)
    ans = 0	##line:(3)
    for i in range(len(arr) // 2):	##line:(4)
        if arr[i] != arr[len(arr) - i - 1]:	##line:(5)
            ans += 1	##line:(6)
    return ans	##line:(7)

smallest_change([1,2,3,5,4,7,9,6]) 