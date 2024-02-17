class main:
	# C
	s = eval(input())
	
	r = ''
	for i in range(len(s)-1, -1, -1):
	    r = s[i] + r
	    if r == 'dream':
	        r = ''
	    if r == 'dreamer':
	        r = ''
	    if r == 'erase':
	        r = ''
	    if r == 'eraser':
	        r = ''
	        
	if r == '':
	    print('YES')
	else:
	    print('NO')