from typing import *	##line:(1)
def modp(n: int, p: int):	##line:(2)
    ret = 1	##line:(3)
    for i in range(n):	##line:(4)
        ret = (2 * ret) % p	##line:(5)
    return ret	##line:(6)

modp(3, 5) 