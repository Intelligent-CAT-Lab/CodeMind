class main:
    import math
    import sys
    
    def add(a, b):
        res = a + b
        return res % mod if res >= mod else res
    
    def mul(a, b):
        res = a * b % mod
        return res if res >= 0 else res + mod
    
    def solve():
        n, k, mod = map(int, sys.stdin.readline().split())
        if k % 2 == 0:
            print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
        else:
            dyn = [[0] * (k + 2) for _ in range(k + 2)]
            dyn[0][0] = 1
            ndyn = [[0] * (k + 2) for _ in range(k + 2)]
            for i in range((n | 1) // 2 + k // 2 + 2):
                for a in ndyn:
                    fill(a, 0)
                mask = (i < (n + 1) // 2) * 1 + (i >= k // 2 + 2) * 2
                for m in range(mask, 0, -1):
                    for j in range(k + 2):
                        for jj in range(k + 2):
                            nj = (m & 1) != 0 and j + 1 or 0
                            njj = (m & 2) != 0 and (j != 0 or jj != 0) and max(j, jj) + 1 or 0
                            if nj < k + 2 and njj < k + 2:
                                ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
                    if m == 0:
                        break
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