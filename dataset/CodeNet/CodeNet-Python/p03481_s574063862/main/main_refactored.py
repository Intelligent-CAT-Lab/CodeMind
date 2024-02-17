class main:
	X,Y=list(map(int,input().split()))
	 
	ans=0
	seki=X
	 
	while seki <= Y:
	    seki*=2
	    ans+=1
	print(ans)