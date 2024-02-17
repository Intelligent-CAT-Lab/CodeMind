class main:
	a,b,c=list(map(int,input().split()))
	d=0
	i=1
	while True:
	    if i%7==0:
	        d=d+a+b
	    else:
	        d=d+a
	    if d>=c:
	        break
	    i=i+1
	print(i)
