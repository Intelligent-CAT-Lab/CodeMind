class main:
    import sys
    
    def solve():
        n, k, mod = map(int, sys.stdin.readline().split())
        if k % 2 == 0:
            print(solve2(n // 2, k // 2 + 1) * solve2((n + 1) // 2, k // 2 + 1) % mod)
        else:
            dyn = [[0] * (k + 2) for _ in range(k + 2)]
            dyn[0][0] = 1
            ndyn = [[0] * (k + 2) for _ in range(k + 2)]
            for i in range((n | 1) // 2 + k // 2 + 2):
                for a in ndyn:
                    a[:] = [0] * (k + 2)
                mask = (i < (n + 1) // 2) + (i >= k // 2 + 2) * 2
                for m in range(mask, -1, -1):
                    for j in range(k + 2):
                        for jj in range(k + 2):
                            nj = (m & 1) * (j + 1 if j + 1 <= k + 1 else 0)
                            njj = (m & 2) * (max(j, jj) + 1 if j != 0 or jj != 0 else 0)
                            if nj < k + 2 and njj < k + 2:
                                ndyn[nj][njj] = (ndyn[nj][njj] + dyn[j][jj]) % mod
                dyn, ndyn = ndyn, dyn
            ans = 0
            for i in range(k + 2):
                for j in range(k + 2):
                    ans = (ans + dyn[i][j]) % mod
            print(ans)
    
    def solve2(n, k):
        dyn = [1] * k
        for i in range(n):
            v = dyn[k - 1]
            for j in range(k - 2, -1, -1):
                dyn[j + 1] = (dyn[j + 1] + v) % mod
            dyn[0] = v
        return dyn[k - 1]
    
    solve()