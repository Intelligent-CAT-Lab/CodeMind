class main:
	N,K = list(map(int, input().split()))
	
	MOD = 10 ** 9 + 7
	
	# just[X]: gcdがぴったり X になる個数
	just = [0] * (K + 1)
	
	for X in range(K, 0, -1):
	    just[X] = pow(K // X, N, MOD)
	    
	    mul = X + X
	    while mul <= K:
	        just[X] -= just[mul]
	        mul += X
	
	ans = 0
	for X in range(1, K + 1):
	    ans += X * just[X] % MOD
	    ans %= MOD
	
	print(ans)