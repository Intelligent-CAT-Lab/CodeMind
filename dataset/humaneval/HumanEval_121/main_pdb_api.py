from typing import *	##line:(1)
def solution(lst):	##line:(2)
    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])	##line:(3)

solution([5, 8, 7, 1])    