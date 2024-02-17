class main:
	import sys
	import itertools
	# import numpy as np
	import time
	import math
	import heapq
	from collections import defaultdict
	from collections import Counter
	sys.setrecursionlimit(10 ** 7)
	 
	INF = 10 ** 18
	MOD = 10 ** 9 + 7
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	readlines = sys.stdin.buffer.readlines
	
	# map(int, input().split())
	
	N = int(eval(input()))
	i = 1
	divs = []
	while i ** 2 <= N:
	    if N % i == 0:
	        divs.append((i, N // i))
	    i += 1
	
	ans = 0
	for p in divs:
	    r = p[0]
	    m = p[1] - 1
	    if m == 0:
	        continue
	    if N % m == r:
	        ans += m
	print(ans)