from typing import *	##line:(1)
def remove_vowels(text):	##line:(2)
    return "".join([s for s in text if s.lower() not in ["a", "e", "i", "o", "u"]])	##line:(3)

remove_vowels('fedcba') 