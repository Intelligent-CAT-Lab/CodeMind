from typing import *	##line:(1)
def sort_array(arr):	##line:(2)
    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))	##line:(3)

sort_array([1,5,2,3,4]) 