class main:
	x, t = list(map(int, input().split()))
	print((x-t if x-t > 0 else 0))