class main:
    import sys
    
    def powerMod(x, exponent):
        prod = 1
        for i in range(63, -1, -1):
            prod = (prod * prod) % 1000000007
            if ((exponent & (1 << i)) != 0):
                prod = (prod * x) % 1000000007
        return prod
    
    def f(n, k):
        t = 0
        for i in range(n, 1, -1):
            t += (t + i) // i
        return t
    
    MOD = 1000000007
    
    n, k = map(int, sys.stdin.readline().strip().split())
    x = 0
    l = f(n, k)
    
    dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        m = powerMod(k + 1, i - 1)
        for u in range(0, l + 1):
            t = 0
            for j in range(0, min(i, k)):
                if u + (u + j) // i <= l:
                    t += dp[i - 1][u + (u + j) // i]
                    t += ((u + j) % i) * m % 1000000007
                    t %= 1000000007
            for j in range(min(i, k) + 1, k + 1):
                t = (t + dp[i - 1][u] + (j + u) * m) % 1000000007
            dp[i][u] = t
    
    print(dp[n][0])