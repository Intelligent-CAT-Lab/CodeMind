class main:
	from sys import exit, setrecursionlimit, stderr
	from functools import reduce
	from itertools import *
	from collections import defaultdict
	from bisect import bisect
	 
	def read():
	  return int(eval(input()))
	 
	def reads():
	  return [int(x) for x in input().split()]
	 
	MOD = 10**9 + 7
	 
	N = read()
	 
	NN = N + 1
	fact = [1] * NN
	for i in range(1, NN):
	  fact[i] = (fact[i-1] * i) % MOD
	 
	def inv(n):
	  return pow(n, MOD-2, MOD)
	 
	invfact = [0] * NN
	invfact[-1] = inv(fact[-1])
	for i in range(NN-2, -1, -1):
	  invfact[i] = invfact[i+1] * (i+1) % MOD
	 
	def comb(n, k):
	  return fact[n] * invfact[n-k] % MOD * invfact[k] % MOD
	 
	S = [0] * N
	for k in range((N+1) // 2, N):
	  S[k] = comb(k-1, N-1-k) * fact[k] % MOD * fact[N-1-k] % MOD
	 
	ans = 0
	for k in range((N+1) // 2, N):
	  ans = (ans + k * (S[k] - S[k-1]) % MOD) % MOD
	print(ans)