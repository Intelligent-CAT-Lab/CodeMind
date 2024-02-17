class main:
	import operator as op
	from functools import reduce
	from math import factorial
	import sys
	
	modulus = 1000000007
	
	factorial = [1, 1]
	for i in range(2, 2000001):
	    factorial.append(factorial[-1] * i % modulus)
	
	factorial_inv_rev = [pow(factorial[-1], 1000000005, modulus)]
	for i in range(len(factorial)-1, 1, -1):
	    factorial_inv_rev.append(factorial_inv_rev[-1] * i % modulus)
	
	def ncr(n, r):
	    if n==r or r==0:
	        return 1
	    else:
	        numelator = factorial[n]
	        denominator = factorial_inv_rev[-r] * factorial_inv_rev[r-n]
	        return numelator * denominator % modulus
	
	h, w, a, b = list(map(int, input().split()))
	
	points = [(i, j) for i, j in zip(list(range(h-a-1, -1, -1)), list(range(b, w)))]
	
	former = [ncr(i+j, i) for i, j in points]
	latter = [ncr(h-i-1+w-j-1, h-i-1) for i, j in points]
	
	print((sum(f*l for f, l in zip(former, latter)) % modulus))