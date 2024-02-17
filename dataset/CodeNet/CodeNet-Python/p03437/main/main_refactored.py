class main:
	x,y=list(map(int,input().split()))
	print((x if x%y else -1))