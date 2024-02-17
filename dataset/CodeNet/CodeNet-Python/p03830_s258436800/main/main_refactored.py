class main:
	import sys
	from collections import defaultdict
	
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	
	in_n = lambda: int(readline())
	in_nn = lambda: list(map(int, readline().split()))
	in_nl = lambda: list(map(int, readline().split()))
	in_na = lambda: list(map(int, read().split()))
	in_s = lambda: readline().rstrip().decode('utf-8')
	
	
	mod = 10**9 + 7
	
	
	def factorize_dict(n):
	    b = 2
	    fct = defaultdict(lambda: 0)
	    while b ** 2 <= n:
	        while n % b == 0:
	            n //= b
	            fct[b] += 1
	        b += 1
	    if n > 1:
	        fct[n] += 1
	    return fct
	
	
	def main():
	    N = in_n()
	
	    prime = defaultdict(int)
	    for n in range(1, N + 1):
	        d = factorize_dict(n)
	        for k, v in list(d.items()):
	            prime[k] += v
	
	    ans = 1
	    for v in list(prime.values()):
	        ans *= (v + 1)
	        ans %= mod
	
	    print(ans)
	
	
	if __name__ == '__main__':
	    main()
