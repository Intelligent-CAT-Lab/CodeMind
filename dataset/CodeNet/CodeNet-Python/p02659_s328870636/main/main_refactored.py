class main:
	from decimal import Decimal
	
	a, b = input().split()
	a = int(a)
	b = Decimal(b)
	
	print((int(a * b)))
