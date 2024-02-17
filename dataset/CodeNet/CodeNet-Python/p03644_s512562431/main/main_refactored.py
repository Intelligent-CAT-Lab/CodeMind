class main:
	N = eval(input())
	N = int(N)
	n = 0
	while 2**n<=N:
	    n=n+1
	print((2**(n-1)))