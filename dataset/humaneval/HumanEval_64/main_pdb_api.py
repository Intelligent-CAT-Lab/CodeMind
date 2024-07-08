from typing import *	##line:(1)
def vowels_count(s):	##line:(2)
    vowels = "aeiouAEIOU"	##line:(3)
    n_vowels = sum(c in vowels for c in s)	##line:(4)
    if s[-1] == 'y' or s[-1] == 'Y':	##line:(5)
        n_vowels += 1	##line:(6)
    return n_vowels	##line:(7)

vowels_count("abcde") 