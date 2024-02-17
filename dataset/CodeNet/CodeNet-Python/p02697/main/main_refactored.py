class main:
	N,M=list(map(int,input().split()))
	
	a,b=1,N//2
	c,d=N//2+1,N
	if N%2==0:
	    a+=1
	i=0
	while i<M:
	    if i<M:
	        print((c,d))
	        i+=1        
	        c,d=c+1,d-1
	    else:
	        break
	    if i<M:
	        print((a,b))
	        a,b=a+1,b-1
	        i+=1
	    else:
	        break
