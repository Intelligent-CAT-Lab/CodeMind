from typing import *	##line:(1)
def anti_shuffle(s):	##line:(2)
    return ' '.join([''.join(sorted(list(i))) for i in s.split(' ')])	##line:(3)

anti_shuffle('Hi') 