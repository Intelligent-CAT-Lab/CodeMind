def max_fill(grid, capacity):
    return sum([math.ceil(sum(arr)/capacity) for arr in grid])	## arr = CLRJ|capacity = CLRJ|grid = CLRJ
