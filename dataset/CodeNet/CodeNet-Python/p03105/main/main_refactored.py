class main:
	a,b,c=list(map(int,input().split()))
	if a*c<b:
	    print(c)
	else:
	    print((b//a))