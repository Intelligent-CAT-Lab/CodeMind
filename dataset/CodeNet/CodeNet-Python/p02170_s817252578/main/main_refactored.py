class main:
	N, K, A = list(map(int, input().split()))
	dp = [0] * (K+1) + [1] * N  # 残りが i 点のときの勝率
	dp[0] = 1
	c = 1
	mod = 998244353
	p_coin = A * pow(100, mod-2, mod) % mod
	p_dice = pow(N, mod-2, mod)
	for i in range(1, K+1):
	    dp[i] = c * p_coin % mod
	    c += (dp[i] - dp[i-N]) * p_dice % mod
	print((dp[K] * pow(p_coin, mod-2, mod) % mod))
	
