class main:
	#! /usr/bin/env python
	
	from itertools import product, starmap, dropwhile
	from math import log
	
	n = int(eval(input()))
	m = int(log(n, 3)) + 2
	for a in product([-1, 0, 1], repeat=m):
	    if n == sum(starmap(lambda t, x: 3 ** t * x, list(zip(reversed(list(range(m))), a)))):
	        print(("".join(["-0+"[x + 1] for x in dropwhile(lambda x: x == 0, a)])))
	        break
	
	
