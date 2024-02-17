class main:
	h, w, a, b = list(map(int, input().split()))
	
	r1 = "0" * a + "1" * (w - a)
	r2 = "1" * a + "0" * (w - a)
	
	for _ in range(b):
	    print(r1)
	for _ in range(h - b):
	    print(r2)
