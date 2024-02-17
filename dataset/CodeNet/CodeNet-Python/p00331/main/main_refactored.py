class main:
	H,R = list(map(int,input().split()))
	
	if H>=0:
	    print((1))
	elif  H<0:
	    if H+R>0:
	        print((1))
	    elif H+R==0:
	        print((0))
	    else:
	        print((-1))
	        
	
