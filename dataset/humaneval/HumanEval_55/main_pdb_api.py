from typing import *	##line:(1)
def fib(n: int):	##line:(2)
    if n == 0:	##line:(3)
        return 0	##line:(4)
    if n == 1:	##line:(5)
        return 1	##line:(6)
    return fib(n - 1) + fib(n - 2)	##line:(7)

fib(10) 