A, B = list(map(int, input().split()))
import numpy as np
Grid = np.concatenate((np.zeros((50, 100), dtype='int64'),np.ones((50,100), dtype='int64')),axis=0)

for b in range(B-1):
    y, x = divmod(b, 50)
    Grid[2*y,2*x] = 1

for a in range(A-1):
    y, x = divmod(a, 50)
    Grid[99-2*y,2*x] = 0

print((*(100, 100)))
for j in range(100):
    print((''.join(['.' if Grid[j,i]==0 else '#' for i in range(100)])))