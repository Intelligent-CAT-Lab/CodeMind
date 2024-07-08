from typing import *	##line:(1)
def count_distinct_characters(string: str) -> int:	##line:(2)
    return len(set(string.lower()))	##line:(3)

count_distinct_characters('abcde' + 'cade' + 'CADE') 