n=int(input())
A,C,G,T,M,R=0,1,2,3,10**9+7,range(4)
dp=[[[[0]*4for k in R]for j in R]for i in range(n+1)]
dp[0][T][T][T]=1
for i in range(1,n+1):
  for j in R:
    for k in R:
      for l in R:
        for m in R:
          if not(any(t==(k,l,m)for t in((A,G,C),(A,C,G),(G,A,C)))or(j,l,m)==(A,G,C)or(j,k,m)==(A,G,C)):dp[i][k][l][m]=(dp[i][k][l][m]+dp[i-1][j][k][l])%M
print(sum(c for a in dp[n]for b in a for c in b)%M)