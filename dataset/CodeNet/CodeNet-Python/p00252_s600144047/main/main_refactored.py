class main:
	a,b,c=list(map(int,input().split()))
	
	if (a,b,c)==(1,1,0):
	   print('Open')
	elif (a,b,c)==(0,0,1):
	    print('Open')
	else:
	    print('Close')
	
