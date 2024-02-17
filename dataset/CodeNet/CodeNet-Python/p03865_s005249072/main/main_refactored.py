class main:
	import sys
	
	s = sys.stdin.readline().strip()
	
	n = len(s)
	
	if s[0] == s[n-1]:
	    move = 1
	else:
	    move = 0
	
	move = (n - move) % 2
	
	if move == 1:
	    print('First')
	else:
	    print('Second')
