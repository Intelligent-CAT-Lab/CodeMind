class main:
	x = int(eval(input()))
	ans = 1
	for b in range(1, int(1000**.5)+1):
	    for p in range(2, 10):
	        y = b**p
	        if y <= x and ans < y:
	            ans = y
	print(ans)
