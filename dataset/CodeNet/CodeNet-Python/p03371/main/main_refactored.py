class main:
	A,B,C,X,Y = list(map(int,input().split()))
	
	mi = min(X,Y)
	a = A*X+B*Y
	b = mi*C*2+A*(X-mi)+B*(Y-mi)
	c = max(X,Y)*C*2
	
	print((min(a,b,c)))