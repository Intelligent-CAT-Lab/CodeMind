import math

def solve(N):
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
    i = l
    vis = [False] * N
    while True:
        if vis[m]:
            return -1
        vis[m] = True
        if m == 0:
            return i
        m = (10 * m + 7) % N
        i += 1

N = 101
print(solve(N))