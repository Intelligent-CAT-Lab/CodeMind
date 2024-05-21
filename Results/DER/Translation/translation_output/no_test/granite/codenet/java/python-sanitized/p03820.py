def calculate_ways(n, k):
    mod = 100000007
    dp = [[0 for _ in range(n+1)] for _ in range(k+1)]
    dp[0][0] = 1
    for i in range(1, k+1):
        for j in range(1, n+1):
            dp[i][j] = dp[i-1][j-1] + dp[i][j-1]
            dp[i][j] %= mod
    return dp[k][n]