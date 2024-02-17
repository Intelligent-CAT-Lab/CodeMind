class main:
	n, a, b, k = list(map(int, input().split()))
	m = n // 2 + 1
	mod = 998244353
	comb = [1] * m
	for i in range(1, m):
	    comb[i] = comb[i - 1] * (n + 1 - i) * pow(i, mod - 2, mod)
	    comb[i] %= mod
	ans = 0
	for i in range(n + 1):
	    if a * i > k:
	        break
	    j = k - a * i
	    if j % b == 0:
	        j //= b
	        if 0 <= j <= n:
	            i, j = min(i, n - i), min(j, n - j)
	            ans += comb[i] * comb[j]
	            ans %= mod
	print(ans)