from typing import *	##line:(1)
def filter_by_prefix(strings: List[str], prefix: str) -> List[str]:	##line:(2)
    return [x for x in strings if x.startswith(prefix)]	##line:(3)

filter_by_prefix([], 'john') 