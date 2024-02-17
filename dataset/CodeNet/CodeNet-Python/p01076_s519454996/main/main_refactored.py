class main:
	# AOJ 1591 Graph Making
	# Python3 2018.7.13 bal4u
	 
	n, d = list(map(int, input().split()))
	if d == 1: print((n*(n-1)//2))
	else: print(((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2)))
