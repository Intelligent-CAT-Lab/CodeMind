from typing import *
def sort_array(arr):
    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))

sort_array([1,5,2,3,4]) 