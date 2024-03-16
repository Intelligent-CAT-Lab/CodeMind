def calculate_sequences(n, mod=1000000007):
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % mod
    return dp[n]

# Sample test case
n = int(input())
print(calculate_sequences(n))