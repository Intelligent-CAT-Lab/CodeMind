import sys
readline = sys.stdin.readline
readlines = sys.stdin.readlines

import numpy as np

N = int(readline())

grid = np.zeros((N,N),np.int8)

grid[::2,::2] = 1
grid[1::2,1::2] = 1

grid[::6,1::6] = 1
grid[::6,5::6] = 1
grid[2::6,1::6] = 1
grid[2::6,3::6] = 1
grid[4::6,3::6] = 1
grid[4::6,5::6] = 1

grid[0,:] = 1
grid[-1,:] = 1
grid[:,0] = 1
grid[:,-1] = 1

grid[::2,::2] = 0
grid[1::2,1::2] = 0

x,y = np.where(grid==1)

print((len(x)))
for cell in zip(x,y):
    print((*cell))

