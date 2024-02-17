class main:
	X,Y=list(map(int,input().split()))
	count=1
	while True:
	    X*=2
	    if X>Y: break
	    else: count+=1
	print(count)