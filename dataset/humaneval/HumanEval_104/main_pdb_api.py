from typing import *	##line:(1)
def unique_digits(x):	##line:(2)
    odd_digit_elements = []	##line:(3)
    for i in x:	##line:(4)
        if all (int(c) % 2 == 1 for c in str(i)):	##line:(5)
            odd_digit_elements.append(i)	##line:(6)
    return sorted(odd_digit_elements)	##line:(7)

unique_digits([15, 33, 1422, 1]) 