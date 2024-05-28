import math 
def is_polite(n): 
	n = n + 1
	return (int)(n+(math.log((n + math.log(n, 2)), 2))) 