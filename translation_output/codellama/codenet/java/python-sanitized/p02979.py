import sys
import math

def add(a, b):
    res = a + b
    return res % mod if res >= mod else res

def mul(a, b):
    res = (a * b) % mod
    return res if res >= 0 else res + mod

def solve():
    n, k = map(int, input().split())
    mod = int(input())
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range((n | 1) // 2 + k // 2 + 2):
            for a in ndyn:
                a.fill(0)
            mask = (i < (n + 1) // 2) * 1 + (i >= k // 2 + 2) * 2
            for m in range(mask, 0, -1):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = (m & 1) * (j + 1) if (m & 1) else 0
                        njj = (m & 2) * max(j, jj + 1) if (m & 2) and (j or jj) else 0
                        if 0 <= nj < k + 2 and 0 <= njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
            t = dyn
            dyn = ndyn
            ndyn = t
        ans = 0
        for i in range(k + 2):
            for j in range(k + 2):
                ans = add(ans, dyn[i][j])
        print(ans)

def solve2(n, k):
    dyn = [1] * k
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

if __name__ == '__main__':
    solve()