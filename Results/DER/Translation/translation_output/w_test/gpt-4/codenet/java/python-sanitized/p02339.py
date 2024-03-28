def solve(n, k):
    mod = 1000000007
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = (dp[i][j] + (j+1) * dp[i][j+1]) % mod

    return dp[n][k]

# Test input
n, k = map(int, input().split())

# Expected output
print(solve(n, k))