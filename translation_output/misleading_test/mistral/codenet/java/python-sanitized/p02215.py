import sys

N, X = map(int, input().split())
MOD = 998244353

dp = [[[0 for _ in range(X+1)] for _ in range(512)] for _ in range(2)]

for i in range(X+1):
    dp[0][i][i] = 1

t = 1
for i in range(1, N):
    t = 1 - t
    for j in range(512):
        dp[t][j] = [[0 for _ in range(X+1)] for _ in range(512)]
    for j in range(512):
        sum = 0
        for k in range(X+1):
            sum += dp[1-t][j][k]
        for k in range(X+1):
            dp[t][j ^ k][k] += sum
            dp[t][j ^ k][k] %= MOD

ans = 0
for i in range(X+1):
    ans += dp[1-t][X][i]

print(ans % MOD)