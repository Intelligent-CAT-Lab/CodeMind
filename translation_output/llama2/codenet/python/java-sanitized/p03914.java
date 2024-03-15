dp[i][j] = dp[i][j-1] + dp[i][j-1] * k
dp[i][j] = dp[i][j-1] + dp[i][j-1] * (N - j - k)
dp[i][j] = dp[i][j-1] + dp[i][j-1] * j