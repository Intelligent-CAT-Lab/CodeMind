class main:
	a, b = list(map(int, input().split()))
	print((max(a+b, a-b, a*b)))