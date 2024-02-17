class main:
	mod=10**9+7
	
	N,M=list(map(int,input().split()))
	dp=[[0 for i in range(N+1)] for j in range(N+1)]
	dp[N][N]=1
	
	for i in range(M-1,-1,-1):
	    for k in range(1,N+1):
	        for j in range(k,N+1):
	            if j==k:
	                if j<N:
	                    dp[j][k]=(j*dp[j][k]+(N-j)*dp[j+1][k])%mod
	                else:
	                    dp[j][k]=(N*dp[j][k])%mod
	            else:
	                if j<N:
	                    dp[j][k]=(k*dp[j][j]+(N-j)*dp[j+1][k]+(j-k)*dp[j][k])%mod
	                else:
	                    dp[j][k]=(k*dp[j][j]+(N-k)*dp[j][k])%mod
	
	print((dp[1][1]))
