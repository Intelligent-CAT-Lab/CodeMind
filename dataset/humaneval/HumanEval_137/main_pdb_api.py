from typing import *	##line:(1)
def compare_one(a, b):	##line:(2)
    temp_a, temp_b = a, b	##line:(3)
    if isinstance(temp_a, str): temp_a = temp_a.replace(',','.')	##line:(4)
    if isinstance(temp_b, str): temp_b = temp_b.replace(',','.')	##line:(5)
    if float(temp_a) == float(temp_b): return None	##line:(6)
    return a if float(temp_a) > float(temp_b) else b 	##line:(7)

compare_one(1, 2) 