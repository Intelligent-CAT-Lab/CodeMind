class main:
	h, a, b = list(map(int, input().split()))
	print(([(h%(a+c)==0) for c in range(b-a+1)].count(True)))
