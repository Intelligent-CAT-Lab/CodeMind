class main:
	def calc(n, mod):
		f = 1
		fac = [1]
		for i in range(1, n + 1):
			f *= i
			f %= mod
			fac.append(f)
		inv = pow(f, mod - 2, mod)
		invs = [1] * (n + 1)
		invs[n] = inv
		for i in range(n, 1, -1):
			inv *= i
			inv %= mod
			invs[i - 1] = inv
		return fac, invs
	
	def cnk(n, r, mod, fac, inv):
		return fac[n] * inv[n - r] * inv[r] % mod
	
	
	n = int(eval(input()))
	
	mod = 998244353
	
	f, inv = calc(n + 10, mod)
	ans = pow(3, n, mod)
	p = [1]
	
	for i in range(n // 2 + 10):
		p.append(p[-1] * 2 % mod)
	for k in range(n // 2 + 1, n + 1):
		cur = 2 * cnk(n, k, mod, f, inv) * p[n - k]
		ans -= cur
		ans %= mod
	print(ans)