class main:
	from fractions import gcd
	H,W,T=list(map(int, input().split()))
	gh, gw = gcd(H, T), gcd(W, T)
	h, w = H // gh, W // gw
	MOD = 1000000007
	print((pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD)))