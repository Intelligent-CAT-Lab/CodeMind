from typing import *	##line:(1)
def filter_integers(values: List[Any]) -> List[int]:	##line:(2)
    return [x for x in values if isinstance(x, int)]	##line:(3)

filter_integers([3, 'c', 3, 3, 'a', 'b']) 