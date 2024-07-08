from typing import *	##line:(1)
def circular_shift(x, shift):	##line:(2)
    s = str(x)	##line:(3)
    if shift > len(s):	##line:(4)
        return s[::-1]	##line:(5)
    else:	##line:(6)
        return s[len(s) - shift:] + s[:len(s) - shift]	##line:(7)

circular_shift(100, 2) 