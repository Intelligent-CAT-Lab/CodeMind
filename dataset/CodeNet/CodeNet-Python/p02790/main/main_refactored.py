class main:
	a,b=list(map(int,input().split()))
	if a<=b:
	    print((str(a)*b))
	else:
	    print((str(b)*a))