class main:
	buf=input().split()
	N=int(buf[0])
	M=int(buf[1])
	
	thres=10**9+7
	
	if abs(N-M)==1:
	    N=min(N,M)
	    retVal=1
	    for i in range(1,N+1):
	        retVal*=(i**2)
	        if retVal>=thres:
	            retVal=retVal%thres
	    retVal*=(N+1)
	    if retVal>=thres:
	        retVal=retVal%thres
	    print(retVal) 
	elif N==M:
	    retVal=2
	    for i in range(1,N+1):
	        retVal*=(i**2)
	        if retVal>=thres:
	            retVal=retVal%thres
	    print(retVal)
	else:
	    print((0))