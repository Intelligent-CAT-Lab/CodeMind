from numpy import *
A,B=map(int,"3 3".split())
M=10**9+7
U=2001
C=zeros((U,U),int64)
C[0,0]=1
for n in range(1,U):
  C[n,1:]+=C[n-1,:-1]
  C[n,:-1]+=C[n-1,:-1]
  C[n]%=M
S=zeros_like(C)
S[0]=1
S[1:]=(C[:-1].cumsum(axis=1)%M).cumsum(axis=1)%M
print(sum(C[B-1,k]*(sum(S[k,:A-k+1])%M)%M for k in range(A+1))%M)