from typing import *	##line:(1)
def is_bored(S):	##line:(2)
    import re	##line:(3)
    sentences = re.split(r'[.?!]\s*', S)	##line:(4)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)	##line:(5)

is_bored("Hello world") 