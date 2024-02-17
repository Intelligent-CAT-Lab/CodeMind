class main:
	a,b,c=list(map(int,input().split()))
	list=[a,b,c]
	list.sort()
	print((int(list[0]*list[1]/2)))