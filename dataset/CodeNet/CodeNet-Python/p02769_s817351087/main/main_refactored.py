class main:
	import sys
	from collections import defaultdict, Counter, namedtuple, deque
	import itertools
	import functools
	import bisect
	import heapq
	import math
	
	MOD = 10 ** 9 + 7
	# MOD = 998244353
	# sys.setrecursionlimit(10**8)
	
	
	class Combination:
	    def __init__(self, mod=10**9+7, n=202020):
	        self.f = [0] * n
	        self.rf = [0] * n
	        self.inv = [0] * n
	        self.f[0], self.f[1] = 1, 1
	        self.rf[0], self.rf[1] = 1, 1
	        self.inv[1] = 1
	        self.MOD = mod
	        for i in range(2, n):
	            self.f[i] = (self.f[i - 1] * i) % self.MOD
	            self.inv[i] = (-self.inv[self.MOD % i] * (self.MOD // i)) % self.MOD
	            self.rf[i] = (self.rf[i - 1] * self.inv[i]) % self.MOD
	
	    def __call__(self, n, r):
	        return (self.f[n] * self.rf[r] * self.rf[n - r]) % self.MOD
	
	
	C = Combination()
	n, k = list(map(int, input().split()))
	ans = 1
	for i in range(1, min(k, n-1)+1):
	    tmp = (C(n, i) * C(n-1, i)) % MOD
	    ans = (ans + tmp) % MOD
	
	print(ans)
