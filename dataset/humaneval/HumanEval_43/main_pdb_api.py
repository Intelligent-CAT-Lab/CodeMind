from typing import *	##line:(1)
def pairs_sum_to_zero(l):	##line:(2)
    for i, l1 in enumerate(l):	##line:(3)
        for j in range(i + 1, len(l)):	##line:(4)
            if l1 + l[j] == 0:	##line:(5)
                return True	##line:(6)
    return False	##line:(7)

pairs_sum_to_zero([1, 3, 5, 0]) 