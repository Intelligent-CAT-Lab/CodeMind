class main:
	import sys
	input = sys.stdin.readline
	sys.setrecursionlimit(10 ** 7)
	
	n = int(eval(input()))
	MOD = 10 ** 9 + 7
	
	factorial = [0] * (n+1)
	factorial[0] = 1
	for i in range(1, n+1):
	    factorial[i] = (factorial[i-1] * i)
	
	n = factorial[n]
	prime_factors = []
	i = 2
	while i ** 2 <= n:
	    ext = 0
	    while n % i == 0:
	        ext += 1
	        n //= i
	    if ext:
	        prime_factors.append((i, ext))
	    i += 1
	if n != 1:
	    prime_factors.append((n, 1))
	
	ans = 1
	for pf, num in prime_factors:
	    ans = (ans * (num + 1)) % MOD
	print(ans)
