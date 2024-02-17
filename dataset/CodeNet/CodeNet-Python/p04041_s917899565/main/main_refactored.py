class main:
	import sys
	input = sys.stdin.readline
	import numpy as np
	
	N,X,Y,Z = list(map(int,input().split()))
	
	MOD = 10 ** 9 + 7
	
	# ダメなやつを数える
	L = max(10,X + Y + Z)
	dp = np.zeros(1 << L+1, dtype = np.int64) # 右から見て部分和として踏む場所
	rng = np.arange(1 << L+1, dtype=np.int64)
	x575 = (1 << Z) + (1 << (Y+Z)) + (1 << (X+Y+Z))
	bad = ((x575 & rng) == x575)
	dp[1] = 1
	
	for n in range(N):
	    prev = dp
	    dp = np.zeros_like(prev)
	    for i in range(1, 11):
	        dp[1::1<<i] += prev.reshape(1<<i, 1<<(L+1-i)).sum(axis = 0)
	    dp[bad] = 0
	    dp %= MOD
	
	answer = pow(10,N,MOD) - dp.sum()
	answer %= MOD
	print(answer)