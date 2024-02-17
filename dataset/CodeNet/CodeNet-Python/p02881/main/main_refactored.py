class main:
	from math import *
	n = int(eval(input()))
	
	def ij(x):
	    for i in range(x, 0, -1):
	        if n/i == n//i:
	            return i, n//i
	
	print((sum(ij(int(sqrt(n)))) - 2))