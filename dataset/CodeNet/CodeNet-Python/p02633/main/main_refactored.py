class main:
	x = int(eval(input()))
	
	for i in range(1, 10**5):
	    if 360 * i % x == 0:
	        print((360 * i // x))
	        break