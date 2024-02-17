class main:
	X, Y, Z = list(map(int, input().split()))
	isu = X - Z
	hito = Y + Z
	print((isu // hito))