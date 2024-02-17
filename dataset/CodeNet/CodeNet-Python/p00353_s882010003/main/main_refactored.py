class main:
	m, f, b = list(map(int, input().split()))
	
	if b <= m:
	    print((0))
	
	elif b <= m + f:
	    print((b - m))
	else:
	    print("NA")
	
