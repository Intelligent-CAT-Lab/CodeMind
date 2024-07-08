from typing import *	##line:(1)
def remove_duplicates(numbers: List[int]) -> List[int]:	##line:(2)
    import collections	##line:(3)
    c = collections.Counter(numbers)	##line:(4)
    return [n for n in numbers if c[n] <= 1]	##line:(5)

remove_duplicates([1, 2, 3, 2, 4, 3, 5]) 