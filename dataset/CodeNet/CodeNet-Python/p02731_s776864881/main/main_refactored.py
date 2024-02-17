class main:
	import sys
	input = lambda: sys.stdin.readline().rstrip()
	from decimal import *
	
	L = int(eval(input()))
	
	d = Decimal(L)
	
	print(((d/3) ** 3))