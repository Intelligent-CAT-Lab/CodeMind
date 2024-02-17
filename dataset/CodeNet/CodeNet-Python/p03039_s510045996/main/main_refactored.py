class main:
	def e_cell_distance(N, M, K, MOD=10**9 + 7):
	    class Combination(object):
	        """
	        組み合わせ
	        参考: https://harigami.net/contents?id=5f169f85-5707-4137-87a5-f0068749d9bb
	        """
	        __slots__ = ["mod", "factorial", "inverse"]
	
	        def __init__(self, max_n: int = 10**6, mod: int = 10**9 + 7):
	            fac, inv = [1], []
	            fac_append, inv_append = fac.append, inv.append
	
	            for i in range(1, max_n + 1):
	                fac_append(fac[-1] * i % mod)
	
	            inv_append(pow(fac[-1], mod - 2, mod))
	
	            for i in range(max_n, 0, -1):
	                inv_append(inv[-1] * i % mod)
	
	            self.mod, self.factorial, self.inverse = mod, fac, inv[::-1]
	
	        def combination(self, n, r):
	            if r == n or r == 0:
	                return 1
	            if r > n:
	                return 0
	            return self.factorial[n] * self.inverse[r] * self.inverse[n - r] % self.mod
	
	    comb = Combination(N * M).combination(N * M - 2, K - 2)
	    t1 = sum([d * (M - d) * (N**2) for d in range(1, M)])
	    t2 = sum([d * (N - d) * (M**2) for d in range(1, N)])
	    t = (t1 + t2) % MOD
	    return (comb * t) % MOD
	
	N, M, K = [int(i) for i in input().split()]
	print((e_cell_distance(N, M, K)))