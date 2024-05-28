a,b,c,d=map(int,input().split())
mod=998244353
dp=[(d+2)*[0]for _ in range(c+2)]
dp[a][b]=1
for i in range(a,c+1):
    for j in range(b,d+1):
        dp[i][j]%=mod
        dp[i+1][j]+=dp[i][j]*j
        dp[i][j+1]+=dp[i][j]*i
        dp[i+1][j+1]-=dp[i][j]*i*j
print(dp[c][d])
