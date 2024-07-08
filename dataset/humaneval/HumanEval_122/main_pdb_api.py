from typing import *	##line:(1)
def add_elements(arr, k):	##line:(2)
    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)	##line:(3)

add_elements([1,-2,-3,41,57,76,87,88,99], 3) 