import sys

MOD = int(input())
k = int(input())
MOD = int(input())

nChooseK = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
for i in range(n + 1):
    nChooseK[i][0] = 1
    nChooseK[i][i] = 1
for i in range(2, n + 1):
    for j in range(1, i >> 1):
        nChooseK[i][j] = (nChooseK[i - 1][j] + nChooseK[i - 1][j - 1]) % MOD

dp = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
for j in range(k, -1, -1):
    dp[0][j] = 1
    dp[1][j] = (k - j) % MOD

for j in range(k - 1, -1, -1):
    dp[0][j] = (dp[0][j + 1] + dp[1][j]) % MOD
    dp[1][j] = (dp[1][j + 1] + dp[0][j]) % MOD

for i in range(2, n + 1):
    for j in range(k - 1, -1, -1):
        res = 0
        for sizeToTheLeft in range(i):
            optionLeft = dp[sizeToTheLeft][j + 1]
            optionRight = nChooseK[i - 1][sizeToTheLeft]
            optionToAddToEachSide = nChooseK[i - 1][sizeToTheLeft]
            res = (res + ((((optionLeft * optionRight) % MOD) * optionToAddToEachSide) % MOD)) % MOD
        dp[i][j] = res
        dp[0][j] = (dp[0][j + 1] + dp[i][j]) % MOD
        dp[1][j] = (dp[1][j + 1] + dp[i][j]) % MOD

print(dp[n][0])