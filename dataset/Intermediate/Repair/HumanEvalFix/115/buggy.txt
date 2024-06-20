def max_fill(grid, capacity):
    import math
    return sum([math.floor(sum(arr)/capacity) for arr in grid])
