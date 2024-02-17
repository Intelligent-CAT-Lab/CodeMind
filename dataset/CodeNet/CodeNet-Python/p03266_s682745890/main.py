N,K=map(int,input().split())
ans=0
a=int(N/K)
ans+=a**3
if K%2==0:
 b=int((N+int(K/2))/K)
 ans+=b**3
print(ans)
