class main:
	import math
	    
	r = float(eval(input()))
	    
	s = r * r * math.pi
	    
	l = r * 2 * math.pi
	    
	print(('%.5f %.5f' % (s, l)))