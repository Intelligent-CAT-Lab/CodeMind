class main:
	H, W, X, Y = list(map(int, input().split()))
	
	if ((H * W) * (X + Y)) % 2:
	    print('No')
	else:
	    print('Yes')
