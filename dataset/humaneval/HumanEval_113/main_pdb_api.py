from typing import *	##line:(1)
def odd_count(lst):	##line:(2)
    res = []	##line:(3)
    for arr in lst:	##line:(4)
        n = sum(int(d)%2==1 for d in arr)	##line:(5)
        res.append("the number of odd elements " + str(n) + "n the str"+ str(n) +"ng "+ str(n) +" of the "+ str(n) +"nput.")	##line:(6)
    return res	##line:(7)

odd_count(['1234567']) 