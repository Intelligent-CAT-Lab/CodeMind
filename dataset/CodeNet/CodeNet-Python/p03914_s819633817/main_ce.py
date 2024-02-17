input = raw_input
range = xrange
n, m = map(int,"3 3".split())
MOD = 10**9+7
dp = [[0]*(n) for i in range(n+1)]
dp[1][0] = 1
for i in range(m):
    new = [[0]*(n) for i in range(n+1)]
    for j in range(1, n+1):
        for k in range(n-j+1):
            pv = dp[j][k]
            if k != n-j: new[j][k+1] = (new[j][k+1] + pv * (n-j-k)) % MOD
            new[j][k] = (new[j][k] + pv * k) % MOD
            new[j+k][0] = (new[j+k][0] + pv * j) % MOD
    dp = new
print(dp[n][0])