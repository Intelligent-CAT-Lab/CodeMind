class main:
	S = eval(input())
	N = len(S)
	mod = 10**9 + 7
	
	p = 1
	
	dp = [[0]*13 for _ in range(N+1)]
	dp[0][0] = 1
	
	for i in range(1,N+1):
	  if S[-i] == '?':
	    for k in range(10):
	      a = (k * p) % 13
	      for j in range(13):
	        dp[i][j] += dp[i-1][j-a] % mod
	        dp[i][j] %= mod
	  else:
	    a = (int(S[-i]) * p) % 13
	    for j in range(13):
	      dp[i][j] += dp[i-1][j-a] % mod
	  p = (p * 10) % 13
	
	print((dp[N][5]))