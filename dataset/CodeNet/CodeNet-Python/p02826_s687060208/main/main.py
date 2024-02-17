N,M=list(map(int,input().split()))
A = list(range(1,N//2+1))*2
if N&1:A+=[(N+1)//2]
d=[1]+[0]*(N+N)
for x in A:
  for i in range(N+1):
    d[i]%=M
    d[i+x]+=d[i]
print((sum(d[:N])%M))