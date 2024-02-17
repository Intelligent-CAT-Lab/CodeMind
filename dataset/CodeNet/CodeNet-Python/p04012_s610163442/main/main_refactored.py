class main:
	from collections import defaultdict
	
	w = eval(input())
	d = defaultdict(int)
	
	for key in w:
	    d[key] += 1
	
	for value in list(d.values()):
	    if value % 2 != 0:
	        print('No')
	        exit()
	print('Yes')
