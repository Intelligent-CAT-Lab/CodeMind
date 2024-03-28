class main:
    import sys
    
    def mod(n, m):
        return n % m
    
    A, B, C, D = map(int, sys.stdin.readline().strip().split())
    MOD = 998244353
    
    dp = [[0 for _ in range(C)] for _ in range(D)]
    sum = [[0 for _ in range(C)] for _ in range(D)]
    
    sum[B - 1][A - 1] = 1
    
    for i in range(A, C):
        sum[B - 1][i] = (sum[B - 1][i - 1] * B) % MOD
    
    for i in range(B, D):
        for j in range(A, C):
            dp[i][j] = dp[i - 1][j] * j
            dp[i][j] += sum[i - 1][j - 1] * j
            dp[i][j] = mod(dp[i][j], MOD)
            sum[i][j] = (sum[i][j - 1] * (i + 1) + dp[i][j]) % MOD
    
    ans = 0
    powC = 1
    
    for i in range(D - 1, B - 1, -1):
        powI = 1
        for j in range(C - 1, A - 1, -1):
            ans = (ans + dp[i][j] * ((powC * powI) % MOD)) % MOD
            powI = (powI * (i + 1)) % MOD
    
    powC = (powC * C) % MOD
    
    ans = (ans + (powC * sum[B - 1][C - 1]) % MOD) % MOD
    
    print(ans)