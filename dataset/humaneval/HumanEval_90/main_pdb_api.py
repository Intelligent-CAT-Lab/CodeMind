from typing import *
def next_smallest(lst):
    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]

next_smallest([1, 2, 3, 4, 5]) 