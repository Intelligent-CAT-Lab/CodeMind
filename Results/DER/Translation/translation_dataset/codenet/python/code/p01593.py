dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])