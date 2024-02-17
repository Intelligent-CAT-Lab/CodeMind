x = list(map(int,list(eval(input()))))
n = len(x)
dp = [[0,1] for _ in range(n+1)]
for i in range(n):
    dp[i+1][0] = min(dp[i][0]+x[i],dp[i][1]+10-x[i])
    dp[i+1][1] = min(dp[i][0]+x[i]+1,dp[i][1]+9-x[i])
print((dp[n][0]))
