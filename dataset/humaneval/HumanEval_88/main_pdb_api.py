from typing import *	##line:(1)
def sort_array(array):	##line:(2)
    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 	##line:(3)

sort_array([15, 42, 87, 32 ,11, 0]) 