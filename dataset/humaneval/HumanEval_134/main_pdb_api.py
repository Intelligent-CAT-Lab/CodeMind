from typing import *	##line:(1)
def check_if_last_char_is_a_letter(txt):	##line:(2)
 	##line:(3)
    check = txt.split(' ')[-1]	##line:(4)
    return True if len(check) == 1 and (97 <= ord(check.lower()) <= 122) else False	##line:(5)

check_if_last_char_is_a_letter("apple") 