from typing import *	##line:(1)
def compare(game,guess):	##line:(2)
    return [abs(x-y) for x,y in zip(game,guess)]	##line:(3)

compare([1,2,3,4,5,1],[1,2,3,4,2,-2])