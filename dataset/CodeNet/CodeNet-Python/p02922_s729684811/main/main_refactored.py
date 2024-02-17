class main:
	import math
	
	a,b = list(map(int, input().split()))
	av = a
	n = 0
	num = 1
	while num < b:
	  n += 1
	  num += av-1
	print(n)