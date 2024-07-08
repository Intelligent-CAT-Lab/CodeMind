from typing import *	##line:(1)
def eat(number, need, remaining):	##line:(2)
    if(need <= remaining):	##line:(3)
        return [ number + need , remaining-need ]	##line:(4)
    else:	##line:(5)
        return [ number + remaining , 0]	##line:(6)

eat(5, 6, 10) 