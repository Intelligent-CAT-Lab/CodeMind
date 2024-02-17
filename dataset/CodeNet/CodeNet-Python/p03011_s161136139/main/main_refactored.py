class main:
	P, Q, R =list(map(int, input().split( )))
	
	res=[P+Q,P+R,Q+R]
	res.sort()
	print((res[0]))