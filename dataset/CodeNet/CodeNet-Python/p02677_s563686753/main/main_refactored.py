class main:
	from sys import exit
	import math
	ii = lambda : int(eval(input()))
	mi = lambda : list(map(int,input().split()))
	li = lambda : list(map(int,input().split()))
	
	a,b,h,m = mi()
	
	rad_m = m
	rad_h = h*5+5*(m/60)
	
	r = min(abs(rad_m-rad_h),360-abs(rad_m-rad_h))
	rad = 360*r/60
	
	print((math.sqrt(a**2+b**2-2*a*b*math.cos(math.radians(rad)))))