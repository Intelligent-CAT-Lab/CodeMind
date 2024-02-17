N,M=map(int,"1 998244353".split())
dp=[[0 for i in range(2*N+1)] for j in range(3*N+1)]
for j in range(N+1):
    dp[0][j]=1
for i in range(1,3*N+1):
    for j in range(2*N+1):
        if 2*N-1>=j>=1:
            dp[i][j]=(dp[i-1][j-1]+dp[i-2][j+1]*(i-1)+dp[i-3][j]*(i-1)*(i-2))%M
        elif j==0:
            dp[i][j]=(dp[i-1][j]+dp[i-2][j+1]*(i-1)+dp[i-3][j]*(i-1)*(i-2))%M
        else:
            dp[i][j]=(dp[i-1][j-1]+dp[i-3][j]*(i-1)*(i-2))%M
print(dp[3*N][N]%M)
