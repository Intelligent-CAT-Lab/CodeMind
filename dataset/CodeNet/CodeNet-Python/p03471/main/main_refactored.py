class main:
	n,y=list(map(int,input().split()))
	for i in range(n+1):
	    for j in range(n-i+1):
	        if (y-(i*10000+j*5000))/1000==(n-i-j):
	            print((str(i)+' '+str(j)+' '+str(n-i-j)))
	            exit()
	print('-1 -1 -1')