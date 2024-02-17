class main:
	x = int(eval(input()))
	t = 0
	while t*(t+1)/2 < x:
	    t += 1
	
	print(t)
