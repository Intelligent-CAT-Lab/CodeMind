class main:
	import numpy as np
	
	
	def exp_np(a, e, m):
	    r = np.identity(a.shape[0], dtype=np.int64)
	    t = a.copy()
	    while e:
	        if e % 2:
	            r = np.dot(r, t) % m
	        t = np.dot(t, t) % m
	        e >>= 1
	    return r
	
	
	l, a, b, m = list(map(int, input().split()))
	
	first_d = len(str(a))
	tail = a + b * (l - 1)
	
	lo = -1
	state = np.array([[0, a % m, 1]])
	
	for d in range(first_d, 19):
	    hi = min((10 ** d - 1 - a) // b, l - 1)
	    cnt = hi - lo
	    coe = np.array([
	        [pow(10, d, m), 0, 0],
	        [1, 1, 0],
	        [0, b % m, 1]
	    ], dtype=np.int64)
	
	    coe = exp_np(coe, cnt, m)
	    state = np.dot(state, coe) % m
	
	    lo = hi
	    if hi == l - 1:
	        break
	
	print((state[0][0]))
