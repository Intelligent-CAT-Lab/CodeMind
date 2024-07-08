from typing import *	##line:(1)
def filter_by_substring(strings: List[str], substring: str) -> List[str]:	##line:(2)
    return [x for x in strings if substring in x]	##line:(3)

filter_by_substring([], 'john') 