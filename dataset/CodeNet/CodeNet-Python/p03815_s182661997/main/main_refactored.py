class main:
	x = int(eval(input()))
	
	N = 2*(x//11)
	
	if x % 11 ==0:
	    pass
	elif x % 11 <= 6:
	    N += 1
	else:
	    N += 2
	    
	print(N)