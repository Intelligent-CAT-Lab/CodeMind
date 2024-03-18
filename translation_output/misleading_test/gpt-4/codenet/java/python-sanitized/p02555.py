def calculate_ways(n):
    mod = 1000000007
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % mod
    return dp[n]

# Test input
n = 7
# Expected output: 92
print(calculate_ways(n))