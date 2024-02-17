class main:
	x,k,d=input().split()
	k=int(k)
	x=int(x)
	d=int(d)
	x=int(abs(x))
	if((k*d)<=x):
	    print((x-(k*d)))
	else:
	    k-=int(x/d)
	    x%=d
	    if(k%2):
	        print((d-x))
	    else:
	        print(x)