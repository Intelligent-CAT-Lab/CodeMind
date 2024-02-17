class main:
	import math
	
	w, h, c = list(map(int, input().split()))
	
	size = math.gcd(w, h)
	cost = w // size * h // size * c
	print(cost)
