class main:
	a,s,d,f=list(map(int,input().split()))
	x3=d-f+s
	y3=f+d-a
	x4=a-f+s
	y4=s+d-a
	print((x3,y3,x4,y4))