from typing import *	##line:(1)
def is_palindrome(text: str):	##line:(2)
    for i in range(len(text)):	##line:(3)
        if text[i] != text[len(text) - 1 - i]:	##line:(4)
            return False	##line:(5)
    return True	##line:(6)

is_palindrome('xywyx') 