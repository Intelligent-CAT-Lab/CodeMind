class main:
	def solve(l):
	    n = 0
	    while 2**n <= l:
	        n += 1
	    E = []
	    for i in range(n-1, -1, -1):
	        x = 2**i
	        if i != n-1:
	            E.append((i, i+1, 0))
	            E.append((i, i+1, x))
	        if l - x >= 2**(n-1):
	            E.append((i, n-1, l-x))
	            l -= x
	    print((n, len(E)))
	    for u, v, x in E:
	        print((u+1, v+1, x))
	
	l = int(eval(input()))
	solve(l)