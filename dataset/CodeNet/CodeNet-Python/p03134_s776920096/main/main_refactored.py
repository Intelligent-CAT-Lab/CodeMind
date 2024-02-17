class main:
	S=eval(input())
	N=len(S)
	C=[0]
	for i in range(N):
	  C.append(C[i]+int(S[i]))
	for i in range(N):
	  C.append(C[N])
	B=C[N]
	DP=[[0]*(B+1) for i in range(2*N+1)]
	DP[0][0]=1
	mod=998244353
	for i in range(2*N):
	  for j in range(B+1):
	    if 2*min(i+1,N)-C[i+1]>=i+1-j:
	      DP[i+1][j]=(DP[i+1][j]+DP[i][j])%mod
	    if j<C[i+1]:
	      DP[i+1][j+1]=DP[i][j]
	print((DP[2*N][B]))