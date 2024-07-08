from typing import *	##line:(1)
def find_max(words):	##line:(2)
    return sorted(words, key = lambda x: (-len(set(x)), x))[0]	##line:(3)

find_max(["name", "of", "string"])