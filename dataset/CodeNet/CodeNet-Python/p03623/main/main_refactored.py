class main:
	x,a,b=list(map(int,input().split()))
	print(('A' if abs(x-a)<abs(x-b) else 'B'))