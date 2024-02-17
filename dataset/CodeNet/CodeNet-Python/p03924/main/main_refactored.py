class main:
	n, m = list(map(int,input().split()))
	mod = 10 ** 9 + 7
	dp=[[[0] * (n + 1) for _ in range(n + 1)] for _ in range(2)]
	dp[0][1][1] = 1
	for i in range(m):
	    for j in range(n + 1):
	        for k in range(n + 1):
	            dp[(i+1)%2][j][k] = 0
	    for j in range(1, n + 1):
	        for k in range(1, j + 1):
	            dp[(i+1)%2][min(j+1,n)][k] += dp[i%2][j][k] * (n - j) % mod
	            dp[(i+1)%2][j][k] += dp[i%2][j][k] * (j - k) % mod
	            dp[(i+1)%2][j][j] += dp[i%2][j][k] * k % mod
	print(dp[m%2][n][n] % mod)
