class main:
	x,y = list(map(int,input().split()))
	print(('Brown' if abs(x-y)<=1 else 'Alice'))