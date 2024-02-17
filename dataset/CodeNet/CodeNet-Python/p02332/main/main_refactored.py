class main:
	N, K = list(map(int, input().split()))
	MOD = 10**9 + 7
	
	if K < N:
	    print((0))
	else:
	    ans = 1
	    for v in range(K, K-N, -1):
	        ans = ans * v % MOD
	    print(ans)
	
