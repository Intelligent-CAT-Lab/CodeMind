from typing import *	##line:(1)
def string_sequence(n: int) -> str:	##line:(2)
    return ' '.join([str(x) for x in range(n + 1)])	##line:(3)

string_sequence(0) 