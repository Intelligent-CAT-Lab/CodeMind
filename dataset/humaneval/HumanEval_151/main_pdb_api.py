from typing import *
def double_the_difference(lst):
    return sum([i**2 for i in lst if i > 0 and i%2!=0 and "." not in str(i)])

double_the_difference([0.2, 3, 5]) 