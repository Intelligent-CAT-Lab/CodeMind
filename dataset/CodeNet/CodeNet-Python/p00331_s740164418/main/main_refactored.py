class main:
	H,R=list(map(int,input().split()))
	print((0 if H+R==0 else(1 if 0<=H+R else -1)))