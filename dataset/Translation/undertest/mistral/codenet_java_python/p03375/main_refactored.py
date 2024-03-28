class main:
    import math
    
    def complex(n):
        res = [[1] * (n+1) for _ in range(n+1)]
        for i in range(1, n+1):
            res[i][0] = res[i][i] = 1
            for j in range(1, i):
                res[i][j] = ((res[i-1][j] + res[i-1][j-1]) % math.pow(10, 9))
        return res
    
    def stirling(n):
        res = [[1] * (n+1) for _ in range(n+1)]
        for i in range(1, n+1):
            res[i][0] = res[i][i] = 1
            for j in range(1, i):
                res[i][j] = ((res[i-1][j-1] + (j+1)*(res[i-1][j] % math.pow(10, 9))) % math.pow(10, 9))
        return res
    
    def beki(a, x, mod):
        res = 1
        for i in range(32):
            if (x >> i) & 1:
                res = (res * a) % mod
            a = (a * a) % mod
        return res
    
    def ways(i):
        res = 0
        b1 = beki(2, N-i, math.pow(10, 9))
        beki1 = 1
        beki2 = beki(2, beki(2, N-i, math.pow(10, 9)) % (math.pow(10, 9) - 1), math.pow(10, 9))
        for j in range(0, i+1):
            res = (res + ways2(i, j, beki1, beki2)) % math.pow(10, 9)
            beki1 = (beki1 * b1) % math.pow(10, 9)
        return res
    
    def ways2(i, j, beki1, beki2):
        return ((S[i][j] * beki1) % math.pow(10, 9) * beki2 % math.pow(10, 9)) % math.pow(10, 9)
    
    N = int(input())
    M = int(input())
    C = complex(N)
    S = stirling(N)
    ans = 0
    for i in range(0, N+1):
        ans = (ans + (i % 2 == 0) * (C[N][i] * ways(i)) % math.pow(10, 9) + (i % 2 == 0) * 0) % math.pow(10, 9)
    print(ans)