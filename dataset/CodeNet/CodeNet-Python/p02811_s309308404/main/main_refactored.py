class main:
	a, b = list(map(int, input().split()))
	
	if 500 * a >= b:
	  print('Yes')
	else:
	  print('No')