from typing import *	##line:(1)
def largest_divisor(n: int) -> int:	##line:(2)
    for i in reversed(range(n)):	##line:(3)
        if n % i == 0:	##line:(4)
            return i	##line:(5)

largest_divisor(3) 