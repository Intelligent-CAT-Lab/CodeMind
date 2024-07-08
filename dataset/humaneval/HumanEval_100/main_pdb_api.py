from typing import *	##line:(1)
def make_a_pile(n):	##line:(2)
    return [n + 2*i for i in range(n)]	##line:(3)

make_a_pile(3) 