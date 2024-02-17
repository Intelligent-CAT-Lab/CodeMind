class main:
	a, b = list(map(int, input().split()))
	if max(a,b)>9:
	  print((-1))
	else:
	  print((a*b))