class main:
    import math
    
    def calc(vy, t):
    	return vy*t - 9.8*t*t/2
    
    def cmp(lb, ub, a):
    	if a < lb+1e-6:
    		return -1
    	elif a > ub-1e-6:
    		return 1
    	else:
    		return 0
    
    def check(qx, qy):
    	a = 9.8*9.8/4
    	b = 9.8*qy - V*V
    	c = qx*qx + qy*qy
    	D = b*b - 4*a*c
    	if D < 0 and D > -1e-6:
    		D = 0
    	if D < 0:
    		return False
    	for d in [-1, 1]:
    		t2 = (-b + d*math.sqrt(D)) / (2*a)
    		if t2 < 0:
    			continue
    		t = math.sqrt(t2)
    		vx = qx / t
    		vy = math.sqrt(V*V - vx*vx)
    		yt = calc(vy, X/vx)
    		if yt < Y