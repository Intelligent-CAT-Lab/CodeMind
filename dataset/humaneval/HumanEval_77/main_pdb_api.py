from typing import *	##line:(1)
def iscube(a):	##line:(2)
    a = abs(a)	##line:(3)
    return int(round(a ** (1. / 3))) ** 3 == a	##line:(4)

iscube(1) 