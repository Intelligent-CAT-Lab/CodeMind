from typing import *	##line:(1)
def fruit_distribution(s,n):	##line:(2)
    lis = list()	##line:(3)
    for i in s.split(' '):	##line:(4)
        if i.isdigit():	##line:(5)
            lis.append(int(i))	##line:(6)
    return n - sum(lis)	##line:(7)

fruit_distribution("5 apples and 6 oranges",19) 