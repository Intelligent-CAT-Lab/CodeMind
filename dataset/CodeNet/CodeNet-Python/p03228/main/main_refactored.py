class main:
	a,b,k=list(map(int,input().split()))
	turn=0
	for i in range(k):
	    if(turn==0):
	        if(a%2==0):
	            b+=a//2
	            a-=a//2
	        else:
	            a-=1
	            b+=a//2
	            a-=a//2
	        turn=1
	    else:
	        if(b%2==0):
	            a+=b//2
	            b-=b//2
	        else:
	            b-=1
	            a+=b//2
	            b-=b//2
	        turn=0
	print((a,b))