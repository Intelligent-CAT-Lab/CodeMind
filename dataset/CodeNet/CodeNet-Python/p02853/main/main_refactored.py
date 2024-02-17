class main:
	# A - DDCC Finals
	x,y = list(map(int, input().split()))
	X = 0
	Y = 0
	
	
	if x == 3:
	    X = 100000
	elif x == 2:
	    X = 200000
	elif x == 1:
	    X = 300000
	else :
	    X = 0
	
	if y == 3:
	    Y = 100000
	elif y == 2:
	    Y = 200000
	elif y == 1:
	    Y = 300000
	else:
	    Y = 0
	
	if x == 1 and y == 1:
	    print((X+Y+400000))
	else:
	    print((X +Y))