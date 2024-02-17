class main:
	from sys import stdin
	import sys
	
	[A, B, C, X, Y] = list(map(int, stdin.readline().rstrip().split()))
	
	## C is expensive
	if A + B <= 2 * C:
	    print((A * X + B * Y))
	
	else:
	    minimum = float('inf')
	    for Z in range(2 * 10**5 + 1):
	        a = (max(0, X - Z // 2)) * A
	        b = (max(0, Y - Z // 2)) * B
	        c = Z * C
	        minimum = min(minimum, (a + b + c))
	    
	    print(minimum)
