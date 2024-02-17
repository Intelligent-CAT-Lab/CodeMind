class main:
	x=int(eval(input()))
	n=x//11
	x=x-11*n
	if x==0:
	    print((2*n))
	
	elif 1<=x<=6:
	    print((1+2*n))
	else:
	    print((2+2*n))
	
