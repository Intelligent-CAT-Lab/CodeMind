class main:
	s = eval(input())
	
	l = len(s)
	
	point = 0
	for a, b in zip(s[0::2], s[1::2]):
	    if a == 'p':
	        point -= 1
	    if b == 'g':
	        point += 1
	print(point)
