class main:
	MOD = 1000000007
	
	N, M = (int(x) for x in input().split())
	
	pow = [0] * (N + 1)
	dp = [0] * (N + 1)
	
	pow[0] = 1
	
	for i in range(1, N + 1):
	    pow[i] = pow[i - 1] * 2
	    pow[i] %= MOD
	
	dp[0] = 1
	
	for i in range(1, M + 1):
	    dp[i] = pow[i]
	
	dp[M] -= 1
	
	for i in range(M + 1, N + 1):
	    dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])
	    dp[i] %= MOD
	
	print(((pow[N] - dp[N] + MOD) % MOD))
	
