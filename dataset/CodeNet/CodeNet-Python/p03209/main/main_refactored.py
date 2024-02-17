class main:
	import sys
	import itertools
	# import numpy as np
	import time
	import math
	import heapq
	from collections import defaultdict
	sys.setrecursionlimit(10 ** 7)
	 
	INF = 10 ** 18
	MOD = 10 ** 9 + 7
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	readlines = sys.stdin.buffer.readlines
	
	# map(int, input().split())
	
	N, X = list(map(int, input().split()))
	
	l = [0] * 51
	l[0] = 1
	p = [0] * 51
	p[0] = 1
	for i in range(1, 51):
	    l[i] = l[i - 1] * 2 + 3
	    p[i] = p[i - 1] * 2 + 1
	
	ans = 0
	for i in range(N, -1, -1):
	    if i == 0 and X >= 1:
	        ans += 1
	        break
	
	    if X <= 1:
	        break
	    elif X <= l[i - 1] + 1:
	        X -= 1
	        continue 
	    elif X == l[i - 1] + 2:
	        ans += 1
	        X -= 2
	    else:
	        ans += p[i - 1] + 1
	        X -= l[i - 1] + 2
	print(ans)