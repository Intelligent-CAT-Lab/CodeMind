from typing import *	##line:(1)
def count_upper(s):	##line:(2)
    count = 0	##line:(3)
    for i in range(0,len(s),2):	##line:(4)
        if s[i] in "AEIOU":	##line:(5)
            count += 1	##line:(6)
    return count	##line:(7)

count_upper('aBCdEf')  