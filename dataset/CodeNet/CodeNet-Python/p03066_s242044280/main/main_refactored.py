class main:
	import sys
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	readlines = sys.stdin.buffer.readlines
	
	import numpy as np
	
	"""
	・累積和の到達地点集合ごとに見る
	・type1：X未満で終わる
	・type2：X+1以上2X未満
	・type3：2X以上、これはXが奇数の場合のみ
	"""
	
	MOD = 998244353
	
	N,X = list(map(int,read().split()))
	
	def cumprod(arr,MOD):
	    L = len(arr); Lsq = int(L**.5+1)
	    arr = np.resize(arr,Lsq**2).reshape(Lsq,Lsq)
	    for n in range(1,Lsq):
	        arr[:,n] *= arr[:,n-1]; arr[:,n] %= MOD
	    for n in range(1,Lsq):
	        arr[n] *= arr[n-1,-1]; arr[n] %= MOD
	    return arr.ravel()[:L]
	
	def make_fact(U,MOD):
	    x = np.arange(U,dtype=np.int64); x[0] = 1
	    fact = cumprod(x,MOD)
	    x = np.arange(U,0,-1,dtype=np.int64); x[0] = pow(int(fact[-1]),MOD-2,MOD)
	    fact_inv = cumprod(x,MOD)[::-1]
	    return fact,fact_inv
	
	U = N+N+100
	fact,fact_inv = make_fact(U,MOD)
	combN = fact[N] * fact_inv[:N+1] % MOD * fact_inv[N::-1] % MOD
	
	def F1(N,X):
	    # X未満で終わる場合
	    def mult(P,Q):
	        # 多項式の積
	        dP = len(P) - 1
	        dQ = len(Q) - 1
	        if dP < dQ:
	            dP,dQ = dQ,dP
	            P,Q = Q,P
	        R = np.zeros(dP+dQ+1,np.int64)
	        for n in range(dQ+1):
	            R[n:n+dP+1] += Q[n] * P % MOD
	        R %= MOD
	        return R[:X]
	    def power(P,n):
	        if n == 0:
	            return np.array([1],dtype=np.int64)
	        Q = power(P,n//2)
	        Q = mult(Q,Q)
	        return mult(P,Q) if n&1 else Q
	    P = np.array([1,1,1],np.int64)
	    Q = power(P,N)
	    return Q.sum() % MOD
	
	def F2(N,X):
	    x = np.zeros(N+1,np.int64)
	    # X+1+2nで終わる場合
	    for n in range(X):
	        m = (X-1) - (2+2*n)
	        if m < 0:
	            break
	        # 2+2n -> X-1に含まれる2の回数ごとに
	        two = np.arange(m//2+1,dtype=np.int64)
	        one = m - 2*two
	        coef = fact[one+two] * fact_inv[one] % MOD * fact_inv[two] % MOD
	        rest = N-one-two-(2*n+2)
	        ind = rest>=0
	        rest = rest[ind]; coef = coef[ind]
	        x[rest] += coef
	    x %= MOD
	    return (x * combN % MOD).sum() % MOD
	
	def F3(N,X):
	    # 2X以上の偶数。Xは奇数で、+2を連打している場合
	    if X%2 == 0:
	        return 0
	    if X > N:
	        return 0
	    n = N-X+1
	    return combN[:n].sum() % MOD
	
	answer = (F1(N,X) + F2(N,X) + F3(N,X)) % MOD
	print(answer)