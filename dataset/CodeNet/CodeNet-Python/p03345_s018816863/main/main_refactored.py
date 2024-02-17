class main:
	a, b, c, k = [int(i) for i in input().split()]
	if k % 2 == 0:
	    print((a - b))
	else:
	    print((b - a))