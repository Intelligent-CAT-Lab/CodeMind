def solve(n, k, mod):
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = (dp[i][j] + (j+1) * dp[i][j+1] % mod) % mod
    return dp[n][k]

#