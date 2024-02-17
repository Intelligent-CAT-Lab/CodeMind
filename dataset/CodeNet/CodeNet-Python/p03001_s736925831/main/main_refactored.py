class main:
	import sys
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	readlines = sys.stdin.buffer.readlines
	
	w, h, x, y = list(map(int, readline().split()))
	
	ans = w * h / 2
	if x == w / 2 and y == h / 2:
	    print((ans, '1'))
	else:
	    print((ans, '0'))