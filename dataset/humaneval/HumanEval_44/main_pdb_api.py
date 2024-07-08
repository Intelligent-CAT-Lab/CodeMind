from typing import *	##line:(1)
def change_base(x: int, base: int):	##line:(2)
    ret = ""	##line:(3)
    while x > 0:	##line:(4)
        ret = str(x % base) + ret	##line:(5)
        x //= base	##line:(6)
    return ret	##line:(7)

change_base(8, 3) 