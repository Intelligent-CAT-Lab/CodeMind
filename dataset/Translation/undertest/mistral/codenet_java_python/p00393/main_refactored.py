class main:
    import sys
    
    mod = 1000000007
    n, m = map(int, sys.stdin.readline().split())
    
    dp = [[0 for _ in range(2)] for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % mod
        if i - m >= 0:
            dp[i][1] = ((dp[i][1] - dp[i - m][0] + mod) % mod)
    
    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
    def pow2(k):
        v = 1
        for i in range(k):
            v *= 2
            v %= mod
        return v