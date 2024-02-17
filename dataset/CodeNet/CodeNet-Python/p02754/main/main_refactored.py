class main:
	n,a,b = list(map(int,input().split()))
	
	k = n//(a+b)
	p = n%(a+b)
	
	print((k*a + min(p,a)))
