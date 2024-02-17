class main:
	A,B=list(map(int,input().split()))
	if (A+B)%2==0:
		print((int((A+B)/2)))
	else:
		print('IMPOSSIBLE')