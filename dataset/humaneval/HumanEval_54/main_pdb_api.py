from typing import *	##line:(1)
def same_chars(s0: str, s1: str):	##line:(2)
    return set(s0) == set(s1)	##line:(3)

same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc') 