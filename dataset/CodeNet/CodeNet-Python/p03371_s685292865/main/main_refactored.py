class main:
	a,b,c,x,y=list(map(int,input().split()))
	l=[]
	for i in range(10**7):
	    s=c*i*2+a*max(0,x-i)+b*max(0,y-i)
	    l.append(s)
	print((min(l)))
