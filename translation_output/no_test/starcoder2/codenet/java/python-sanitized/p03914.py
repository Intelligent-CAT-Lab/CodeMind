n, m = map(int, input().split())
MOD = 1000000007
dp = [[0 for i in range(n+1)] for j in range(n+1)]
dp[1][0] = 1
for i in range(m):
    next = [[0 for i in range(n+1)] for j in range(n+1)]
    for a in range(n+1):
        for b in range(n+1):
            if dp[a][b] == 0:
                continue
            next[a+b][0] = (next[a+b][0] + dp[a][b] * a) % MOD
            next[a][b+1] = (next[a][b+1] + dp[a][b] * (n-a-b)) % MOD
            next[a][b] = (next[a][b] + dp[a][b] * b) % MOD
    dp = next
print(dp[n][0])