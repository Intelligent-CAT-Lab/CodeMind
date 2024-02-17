import math

grid = [[0,0,1,0], [0,1,0,0], [1,1,1,1]]
capacity = 1
print(sum([math.ceil(sum(arr) / capacity) for arr in grid]))