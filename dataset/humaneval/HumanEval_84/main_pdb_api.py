from typing import *	##line:(1)
def solve(N):	##line:(2)
    return bin(sum(int(i) for i in str(N)))[2:]	##line:(3)

solve(1000) 