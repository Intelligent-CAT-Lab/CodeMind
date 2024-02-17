class main:
	U = 2*10**5
	MOD = 10**9+7
	 
	fact = [1]*(U+1)
	fact_inv = [1]*(U+1)
	two = [1]*(U+1)
	two_inv = [1]*(U+1)
	 
	for i in range(1,U+1):
	    fact[i] = (fact[i-1]*i)%MOD
	    two[i] = (two[i-1]*2)%MOD
	fact_inv[U] = pow(fact[U], MOD-2, MOD)
	two_inv[U] = pow(two[U], MOD-2, MOD)
	 
	for i in range(U,0,-1):
	    fact_inv[i-1] = (fact_inv[i]*i)%MOD
	    two_inv[i-1] = (two_inv[i]*2)%MOD
	
	def comb(n, k):
	    if k < 0 or k > n:
	        return 0
	    z = fact[n]
	    z *= fact_inv[k]
	    z %= MOD
	    z *= fact_inv[n-k]
	    z %= MOD
	    return z
	  
	B, W = list(map(int, input().split()))
	p = 0
	q = 0
	for i in range(1, B+W+1):
	  ans = 1 - p + q
	  ans %= MOD
	  ans *= two_inv[1]
	  ans %= MOD
	  print(ans)
	  p += comb(i-1, B-1) * two_inv[i] % MOD
	  p %= MOD
	  q += comb(i-1, W-1) * two_inv[i] % MOD
	  q %= MOD