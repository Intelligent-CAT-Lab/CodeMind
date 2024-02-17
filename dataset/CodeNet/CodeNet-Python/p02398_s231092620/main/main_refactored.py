class main:
	a,b,c = list(map(int,input().split()))
	count = 0
	for i in range(a,b+1):
	    if c%i==0:
	        count +=1
	print(count)