from typing import *
def maximum(arr, k):
    if k == 0:
        return []
    arr.sort()
    ans = arr[-k:]
    return ans

maximum([-3, -4, 5], 3) 