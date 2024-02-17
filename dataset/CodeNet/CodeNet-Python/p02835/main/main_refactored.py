class main:
	a,b,c = list(map(int, input().split()))
	print(('win' if a+b+c<22 else 'bust'))