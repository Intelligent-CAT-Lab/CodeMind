class main:
	# coding: utf-8
	
	MOD = 998244353
	
	def getInv(N):
	    inv = [0] * (N + 1)
	    inv[1] = 1
	    inv[1] = 1
	    for i in range(2, N + 1):
	        inv[i] = (-(MOD // i) * inv[MOD % i]) % MOD
	
	    return inv
	
	def getCmb(N):
	    inv = getInv(N)
	    nCr = [0] * (N + 1)
	    nCr[0] = 1
	    nCr[0] = 1
	    
	    for i in range(1, N + 1):
	        nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD
	    
	    return nCr
	
	def solve(N, A, B, K):
	    ans = 0
	    nCr = getCmb(N)
	    for a in range(N + 1):
	        b = (K - A * a) // B
	        if (A * a + B * b == K) and (0 <= b <= N):
	            ans += (nCr[a] * nCr[b]) % MOD
	            ans %= MOD
	    return ans
	    
	
	if __name__ == "__main__":
	    N, A, B, K = list(map(int, input().split()))
	    print((solve(N,A,B,K)))
