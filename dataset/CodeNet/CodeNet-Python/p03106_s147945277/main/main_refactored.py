class main:
	a,b,k = list(map(int,input().split()))
	
	ans = []
	for val in range(1,min(a,b)+1):
	    #print(val)
	    if a % val == 0 and b % val ==0:
	        ans.append(val)
	        #print(val)
	
	print((ans[-k]))