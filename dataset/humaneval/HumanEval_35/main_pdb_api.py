from typing import *	##line:(1)
def max_element(l: list):	##line:(2)
    m = l[0]	##line:(3)
    for e in l:	##line:(4)
        if e > m:	##line:(5)
            m = e	##line:(6)
    return m	##line:(7)

max_element([1, 2, 3]) 