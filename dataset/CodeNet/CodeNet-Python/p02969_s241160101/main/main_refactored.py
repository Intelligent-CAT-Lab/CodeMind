class main:
	from collections import defaultdict,deque, Counter
	import sys,heapq,bisect,math,itertools,string,queue,copy,time
	import numpy as np
	sys.setrecursionlimit(10**8)
	INF = float('inf')
	mod = 10**9+7
	eps = 10**-7
	def inp(): return int(sys.stdin.readline())
	def inpl(): return list(map(int, sys.stdin.readline().split()))
	def inpl_str(): return list(sys.stdin.readline().split())
	
	n = inp()
	print((3*n*n))