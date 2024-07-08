from typing import *	##line:(1)
def below_threshold(l: list, t: int):	##line:(2)
    for e in l:	##line:(3)
        if e >= t:	##line:(4)
            return False	##line:(5)
    return True	##line:(6)

below_threshold([1, 20, 4, 10], 21) 