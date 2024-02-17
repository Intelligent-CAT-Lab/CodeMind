class main:
	a, b, c = list(map(int, input().split()))
	
	if a < b:
	    if c < a:
	        print((c, b))
	    elif b < c:
	        print((a, c))
	    else:
	        print((a, b))
	else:
	    if c < b:
	        print((c, a))
	    elif a < c:
	        print((b, c))
	    else:
	        print((b, a))
