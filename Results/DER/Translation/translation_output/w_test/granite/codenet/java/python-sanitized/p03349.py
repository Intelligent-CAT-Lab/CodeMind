import sys

MOD = int(input().split()[2])
n, k = map(int, input().split())

n_choose_k = [[0] * (k + 1) for _ in range(n + 1)]
n_choose_k[0][0] = 1
for i in range(1, n + 1):
    n_choose_k[i][0] = 1
    n_choose_k[i][i] = 1
    for j in range(1, i):
        n_choose_k[i][j] = (n_choose_k[i - 1][j - 1] + n_choose_k[i - 1][j]) % MOD

dp = [[0] * (k + 1) for _ in range(n + 1)]
dp[0][k] = 1
for j in range(k - 1, -1, -1):
    dp[0][j] = dp[0][j + 1]

for i in range(1, n + 1):
    for j in range(k - 1, -1, -1):
        for l in range(i):
            dp[i][j] = (dp[i][j] + dp[l][j + 1] * n_choose_k[i - 1][l] * dp[i - 1 - l][j]) % MOD
        dp[i][j] = (dp[i][j] + dp[i][j + 1]) % MOD

print(dp[n][0])