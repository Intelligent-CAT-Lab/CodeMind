class main:
	import math
	x1,y1,x2,y2 = list(map(float,input().split()))
	print((math.hypot(x2-x1,y2-y1)))