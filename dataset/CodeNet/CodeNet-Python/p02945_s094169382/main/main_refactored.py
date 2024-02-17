class main:
	A, B = list(map(int, input().split()))
	print((max(A+B, A-B, A*B)))