class main:
	s = 0
	d = 1
	A, B, C = list(map(int, input().split()))
	
	while True:
	    if s >= C:
	        break
	
	    s += A
	
	    if d % 7 == 0:
	        s += B
	
	    d += 1
	
	print((d - 1))
