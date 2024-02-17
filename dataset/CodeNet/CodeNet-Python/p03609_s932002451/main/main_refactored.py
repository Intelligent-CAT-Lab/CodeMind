class main:
	x, t = list(map(int, input().split()))
	print(((x - t) if x > t else 0))