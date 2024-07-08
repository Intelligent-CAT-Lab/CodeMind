from typing import *	##line:(1)
def greatest_common_divisor(a: int, b: int) -> int:	##line:(2)
    while b:	##line:(3)
        a, b = b, a % b	##line:(4)
    return a	##line:(5)

greatest_common_divisor(3, 7) 