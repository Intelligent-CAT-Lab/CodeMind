N,M=map(int,input().split())
DP=[[-1]*6000 for i in range(6000)]
def P(n,k):
  if n<0 or k<1:
    return 0
  if DP[n][k]!=-1:
    return DP[n][k]
  if k==1:
    DP[n][k]=1
    return 1
  DP[n][k]=(P(n,k-1)+P(n-k,k))%M
  return DP[n][k]

for i in range(5500):
  for j in range(i+1):
    P(i+1,j+1)
X=[0]
DP[0][0]=1
for i in range(5500):
  X.append(0)
  for j in range(i+1):
    X[-1]=(X[-1]+DP[j][j]*DP[i-j][i-j])%M
Y=[0]
for i in range(10800):
  Y.append(Y[i]+X[i>>1])
P=0
for i in range(1,N+1):
  P=(P+X[i])%M
  if 2*i>N:
    P=(P-Y[2*i-N])%M
print(P)