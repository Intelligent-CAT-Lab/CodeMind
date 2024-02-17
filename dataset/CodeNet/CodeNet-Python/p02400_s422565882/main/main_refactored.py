class main:
	import math
	
	r = float(input())
	
	menseki = r ** 2 * math.pi
	shuu = 2 * r * math.pi
	
	print(("{:.6f} {:.6f}".format(menseki, shuu)))