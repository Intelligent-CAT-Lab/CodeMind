from typing import *
import math


def max_fill(grid, capacity):
    return sum([math.ceil(sum(arr) / capacity) for arr in grid])
