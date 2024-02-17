class main:
	def search(x, y):
	    x_min = 0
	    y_min = 0
	    x_max = 0
	    y_max = 0
	    f = 0
	    f1 = 1
	    f2 = 0
	    p = 0
	    while(True):
	        if ( x_min <= x and x <= x_max and
	             y_min <= y and y <= y_max  ): return p%3 + 1
	        f = f1 + f2
	        if ( p % 4 == 0 ):  x_max += f  # east
	        elif ( p % 4 == 1 ): y_max += f # north
	        elif ( p % 4 == 2 ): x_min -= f # west
	        else:  y_min -= f               # south
	        f2 = f1
	        f1 = f
	        p = p + 1
	
	x,y = list(map(int, input().split()))
	print((search(x, y)))
	
	
