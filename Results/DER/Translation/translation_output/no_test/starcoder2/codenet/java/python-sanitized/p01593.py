n, m = map(int, input().split())
dp = [0] * (n + 1)
dp[0] = 1
for j in range(1, n + 1):
    for i in range(1, min(m, j) + 1):
        dp[j] += dp[j - i] / j
print('{:.12f}'.format(dp[n]))