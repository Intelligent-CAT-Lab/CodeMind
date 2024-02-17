class main:
	# coding: utf-8
	m,n = list(map(int,input().split()))
	mod = 10 ** 9 + 7
	
	ans = pow(m, n, mod)
	
	print(ans)
