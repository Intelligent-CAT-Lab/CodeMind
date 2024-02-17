class main:
	import math
	
	s = input()
	
	memory = [i for i in range(30, 121, 10)]
	r = ''
	r += ''.join(['+'*i+'>' for i in range(30, 121, 10)])
	r += '<' * 10
	
	point = 0
	for c in s:
	    c = ord(c)
	    n = c / 10 - 3
	    d = int(math.fabs(point - n))
	    if point < n:
	        r += '>' * d
	    else:
	        r += '<' * d
	    point = n
	
	    l = int(math.fabs(memory[point] - c))
	    if memory[point] < c:
	        r += '+' * l
	    else:
	        r += '-' * l
	    memory[point] = c
	
	    r += '.'
	
	print(r)