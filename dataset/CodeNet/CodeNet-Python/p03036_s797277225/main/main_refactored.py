class main:
	r, D, x = list(map(int, input().split()))
	
	for i in range(10):
	    x = r * x - D
	    print(x)    