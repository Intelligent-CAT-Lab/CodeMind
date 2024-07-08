from typing import *	##line:(1)
def encode(message):	##line:(2)
    vowels = "aeiouAEIOU"	##line:(3)
    vowels_replace = dict([(i, chr(ord(i) + 2)) for i in vowels])	##line:(4)
    message = message.swapcase()	##line:(5)
    return ''.join([vowels_replace[i] if i in vowels else i for i in message])	##line:(6)

encode('TEST') 