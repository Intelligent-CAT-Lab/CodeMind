class main:
	A,B = list(map(int,input().split()))
	
	if A == 1:
	    A = 14
	
	if B == 1:
	    B = 14
	    
	if A>B:
	    print('Alice')
	elif B>A:
	    print('Bob')
	else:
	    print('Draw')