a,b,c,d = map(int,input().split())
mod = 998244353
dp = [[0]*(d+1) for _ in range(c+1)]
dp[a][b] = 1
for i in range(a+1,c+1):
    dp[i][b] = dp[i-1][b]*b
    dp[i][b] %= mod
for i in range(a,c+1):
    for j in range(b+1,d+1):
        dp[i][j] += dp[i][j-1]*i+dp[i-1][j]*j-dp[i-1][j-1]*(i-1)*(j-1)
        dp[i][j] %= mod
print(dp[c][d])