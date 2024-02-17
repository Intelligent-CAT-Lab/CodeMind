class main:
	import sys
	# import re
	import math
	import collections
	# import decimal
	import bisect
	import itertools
	import fractions
	# import functools
	import copy
	# import heapq
	import decimal
	# import statistics
	import queue
	
	# import numpy as np
	
	sys.setrecursionlimit(10000001)
	INF = 10 ** 16
	MOD = 10 ** 9 + 7
	# MOD = 998244353
	
	ni = lambda: int(sys.stdin.readline())
	ns = lambda: list(map(int, sys.stdin.readline().split()))
	na = lambda: list(map(int, sys.stdin.readline().split()))
	
	
	# ===CODE===
	
	def main():
	    n, k = ns()
	    
	    if n>k:
	        print((0))
	        exit()
	    
	    a = math.factorial(k)
	    b = math.factorial(k - n)
	    ans = a // b  % MOD
	    print(ans)
	
	
	if __name__ == '__main__':
	    main()
	
