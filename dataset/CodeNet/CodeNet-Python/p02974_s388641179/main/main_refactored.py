class main:
	N, K = list(map(int, input().split()))
	MOD = 10 ** 9 + 7
	
	# dp[i][j][k] iまで見た, j個保留, 奇妙さk
	dp = [[[0]*(K+N*2+1) for _ in range(N+1)] for _ in range(N+1)]
	dp[0][0][0] = 1
	
	for i in range(N) :
	    for j in range(i+1) :
	        for k in range(K+1) :
	            dp[i+1][j][k+j*2] += dp[i][j][k]
	            dp[i+1][j][k+j*2] %= MOD
	            dp[i+1][j+1][k+(j+1)*2] += dp[i][j][k]
	            dp[i+1][j+1][k+(j+1)*2] %= MOD
	            dp[i+1][j][k+j*2] += dp[i][j][k] * j * 2
	            dp[i+1][j][k+j*2] %= MOD
	            if j >= 1 :
	                dp[i+1][j-1][k+(j-1)*2] += dp[i][j][k] * j * j
	                dp[i+1][j-1][k+(j-1)*2] %= MOD
	                
	print((dp[N][0][K]))