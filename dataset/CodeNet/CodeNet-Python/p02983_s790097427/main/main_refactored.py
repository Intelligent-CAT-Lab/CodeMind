class main:
	# -*- coding: utf-8 -*-
	import numpy as np
	import sys
	from collections import deque
	from collections import defaultdict
	import heapq
	import collections
	import itertools
	import bisect
	from scipy.special import comb
	import copy
	sys.setrecursionlimit(10**6)
	
	
	def zz():
	    return list(map(int, sys.stdin.readline().split()))
	
	
	def z():
	    return int(sys.stdin.readline())
	
	
	def S():
	    return sys.stdin.readline()[:-1]
	
	
	def C(line):
	    return [sys.stdin.readline() for _ in range(line)]
	
	
	L, R = zz()
	mod = 2019
	
	range_ = min(R-L+1, 2019)
	kouho = []
	kouho = [i for i in range(L, L + range_)]
	ans = (kouho[0]*kouho[1]) % mod
	for i, j in itertools.product(kouho, repeat=2):
	    if (i == j):
	        continue
	    ans = min(ans, (i*j) % mod)
	print(ans)
