import sys

r = sys.stdin

N, M = map(int, r.readline().split())
MOD = 1000000007

dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1)]
dp[0][1][1] = 1

for i in range(M):
    for j in range(N+1):
        for k in range(N+1):
            if j != N:
                dp[i+1][j+1][k] += (dp[i][j][k] * (N-j)) % MOD
                dp[i+1][j+1][k] %= MOD
            dp[i+1][j][k] += (dp[i][j][k] * (j-k)) % MOD
            dp[i+1][j][k] %= MOD
            dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
            dp[i+1][j][j] %= MOD

print(dp[M][N][N])