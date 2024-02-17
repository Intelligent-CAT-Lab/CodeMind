class main:
	
	def getprime(n):
	    if not isinstance(n, int):
	        raise TypeError("Input int")
	    prime = []
	    # 約数はsqrt(N)まで調べればOK
	    data = [i+1 for i in range(1,n)]
	    while True:
	        p = data[0]
	        if p >= int(n**0.5):
	            return prime+data
	        prime.append(p)
	        # pで割り切れないものだけを残す
	        data = [d for d in data if d%p != 0]
	
	from collections import defaultdict
	def factorization(n):
	    # n >= 1を想定
	    factors = defaultdict(int)
	    if n == 1:
	        return {}
	    if int(n**0.5) == 1:
	        return {n:1} 
	    primes = getprime(int(n**0.5))
	    for prime in primes:
	        while n % prime == 0:
	            factors[prime] += 1
	            n //= prime
	    if n != 1:
	        factors[n] += 1
	    return factors
	n,p = list(map(int, input().split()))
	if p == 1:
	    print((1))
	    exit()
	ans = 1
	d = factorization(p)
	for k in list(d.keys()):
	    if d[k] >= n:
	        ans *= (k**(d[k]//n))
	print(ans)