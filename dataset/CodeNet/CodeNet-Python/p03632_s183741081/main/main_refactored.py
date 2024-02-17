class main:
	a,b,c,d=list(map(int,input().split()))
	print((max([min(b,d)-max(a,c),0])))