from typing import *	##line:(1)
def largest_smallest_integers(lst):	##line:(2)
    smallest = list(filter(lambda x: x < 0, lst))	##line:(3)
    largest = list(filter(lambda x: x > 0, lst))	##line:(4)
    return (max(smallest) if smallest else None, min(largest) if largest else None)	##line:(5)

largest_smallest_integers([2, 4, 1, 3, 5, 7]) 