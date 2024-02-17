class main:
	import math
	n=int(eval(input()))
	s=math.factorial(n)
	ans=s%(10**9+7)
	print(ans)