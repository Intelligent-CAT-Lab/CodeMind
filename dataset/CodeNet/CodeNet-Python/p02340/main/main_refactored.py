class main:
	N, K = list(map(int, input().split()))
	MOD = 10**9 + 7
	
	D = [[0]*(K+1) for i in range(N+1)]
	for n in range(0, N+1):
	    D[n][1] = 1
	for k in range(1, K+1):
	    D[0][k] = 1
	for n in range(1, N+1):
	    for k in range(1, K+1):
	        if n >= k:
	            D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD
	        else:
	            D[n][k] = D[n][n]
	print((D[N][K]))
	
