S,K=input().split()
K=int(K)
K=min(K,300)
mod=998244353
a=[]
val=0
for i in range(len(S)):
    if S[i]=="0":
        a.append(val)
        val=0
    else:
        val+=1

if val!=0:
    a.append(val)
m=len(a)
K=min(sum(a),K)

dp=[[0 for i in range(K+1)] for j in range(K+1)]

for j in range(K+1):
    dp[j][j]=1

b=[a[i] for i in range(m)]
c=[a[i] for i in range(m)]
for i in range(1,m):
    b[i]+=b[i-1]
b=[0]+b
for i in range(m-2,-1,-1):
    c[i]+=c[i+1]
for i in range(m-1,-1,-1):
    ndp=[[0 for j in range(K+1)] for k in range(K+1)]
    for k in range(min(b[i],K)+1):
        for j in range(min(K,k+c[i])+1):
            M=max(k-j,-a[i])
            ndp[j][k]=sum(dp[j+l][k] for l in range(max(0,M),K-j+1))+sum(dp[j][k+l] for l in range(1,min(K-k,-M)+1))
            ndp[j][k]%=mod
    dp=ndp

print(dp[0][0])
