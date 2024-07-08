from typing import *	##line:(1)
def digitSum(s):	##line:(2)
    if s == "": return 0	##line:(3)
    return sum(ord(char) if char.isupper() else 0 for char in s)	##line:(4)

digitSum("You arE Very Smart") 