from typing import *	##line:(1)
def add(lst):	##line:(2)
    return sum([lst[i] for i in range(1, len(lst), 2) if lst[i]%2 == 0])	##line:(3)

add([4, 88]) 