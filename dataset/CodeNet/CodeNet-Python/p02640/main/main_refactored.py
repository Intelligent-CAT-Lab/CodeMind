class main:
	x, y = list(map(int, input().split()))
	count = 0
	for a in range(x+1):
	    b = x - a
	    if (2*a + 4*b) == y:
	        count = 1
	        break
	    else:
	        pass
	print(("Yes" if count == 1 else "No"))