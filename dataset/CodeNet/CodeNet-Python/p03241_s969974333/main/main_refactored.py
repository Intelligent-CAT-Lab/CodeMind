class main:
	import sys
	def input(): return sys.stdin.readline().strip()
	def mapint(): return list(map(int, input().split()))
	sys.setrecursionlimit(10**9)
	
	N, M = mapint()
	from bisect import bisect_left
	def make_divisors(n):
	    lower_divisors , upper_divisors = [], []
	    i = 1
	    while i*i <= n:
	        if n % i == 0:
	            lower_divisors.append(i)
	            if i != n // i:
	                upper_divisors.append(n//i)
	        i += 1
	    return lower_divisors + upper_divisors[::-1]
	
	div = [1]+make_divisors(M)
	div.sort()
	g = div[bisect_left(div, N)]
	print((M//g))
