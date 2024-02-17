class main:
	N, K = list(map(int, input().split()))
	MOD = 10**9 + 7
	
	D = [[0]*(K+1) for i in range(N+1)]
	for i in range(1, N+1):
	    D[i][1] = 1
	for i in range(1, min(N, K)+1):
	    D[i][i] = 1
	for n in range(1, N+1):
	    for k in range(2, min(n-1, K)+1):
	        D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD
	print((D[N][K] % MOD))
	
