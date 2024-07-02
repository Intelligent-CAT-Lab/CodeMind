from typing import *
def monotonic(l: list):
    if l == sorted(l) or l == sorted(l, reverse=True):
        return True
    return False

monotonic([1, 2, 4, 10]) 