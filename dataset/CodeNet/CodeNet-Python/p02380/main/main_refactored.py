class main:
	import math
	a, b, c = list(map(int, input().split()))
	print((0.5*a*b*math.sin(math.radians(c))))
	print((a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5))
	print((b*math.sin(math.radians(c))))
