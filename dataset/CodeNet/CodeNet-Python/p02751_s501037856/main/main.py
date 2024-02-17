import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

N,M = list(map(int,read().split()))

def solve(N,M):
    if N > M:
        return solve(M,N).T
    H = np.array([[0]], np.int8)
    for i in range(M):
        H = np.tile(H, (2,2))
        H[1<<i:,1<<i:] ^= 1
    H = np.diff(H, axis=0)
    H = np.diff(H, axis=1)
    return (H % 2)[:(1<<N) - 1]

H = solve(N,M)
size = 0
for row in H:
    word = ''.join(row.astype(str))
    print(word)
    