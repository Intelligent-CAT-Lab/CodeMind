class main:
	import math
	a,b,n=list(map(int,input().split()))
	if b<=n+1:
	    x=b-1
	else:
	    x=n
	g=math.floor(a*x/b)
	print(g)