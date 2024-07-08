from typing import *	##line:(1)
def double_the_difference(lst):	##line:(2)
    return sum([i**2 for i in lst if i > 0 and i%2!=0 and "." not in str(i)])	##line:(3)

double_the_difference([0.2, 3, 5]) 