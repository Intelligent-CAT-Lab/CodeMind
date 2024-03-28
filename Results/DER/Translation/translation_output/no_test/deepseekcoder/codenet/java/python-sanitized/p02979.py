import sys
from math import max, min
from array import array

def add(a, b):
    res = a + b
    return res % mod if res >= mod else res

def mul(a, b):
    res = (a * b) % mod
    return res if res >= 0 else res + mod

def solve2(n, k):
    dyn = [1] * k
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

def solve():
    global mod
    n, k = map(int, sys.stdin.readline().split())
    mod = int(sys.stdin.readline())
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range(n // 2 + k // 2 + 2):
            for a in ndyn:
                a[:] = [0] * (k + 2)
            mask = (i < (n + 1) // 2) + ((i >= k // 2 + 2) << 1)
            for m in range(mask, -1, -1):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = min(j + 1, k + 1) if m & 1 else 0
                        njj = max(j, jj) + 1 if m & 2 and j != 0 or jj != 0 else 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
            dyn, ndyn = ndyn, dyn
        print(sum(sum(dyn, [])))

if __name__ == "__main__":
    solve()