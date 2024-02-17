class main:
	N, D = tuple([int(s) for s in input().split(' ')])
	if (N % (2 * D + 1) == 0):
	    print((N // (2 * D + 1)))
	else:
	    print((N // (2 * D + 1) + 1))