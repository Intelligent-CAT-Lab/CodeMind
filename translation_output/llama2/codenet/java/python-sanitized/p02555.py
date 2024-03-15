import sys

n = int(sys.stdin.readline())
mod = 1000000007
dp = [1] * (n + 1)
dp[0] = 1
for i in range(3, n + 1):
    for j in range(3, i + 1):
        dp[i] = (dp[i] + dp[i - j]) % mod
print(dp[n])