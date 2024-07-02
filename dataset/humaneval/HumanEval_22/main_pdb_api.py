from typing import *
def filter_integers(values: List[Any]) -> List[int]:
    return [x for x in values if isinstance(x, int)]

filter_integers([3, 'c', 3, 3, 'a', 'b']) 