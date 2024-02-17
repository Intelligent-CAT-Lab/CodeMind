class main:
	
	
	import sys
	input = sys.stdin.readline
	
	
	def eprint(*args, **kwargs):
	    print(*args, file=sys.stderr, **kwargs)
	    return
	
	
	def reverse_range(Large_a, Small_b, i):  # b < a ,  get [b, a)
	    return list(range(Small_b, Large_a, -i))[::-1]  # range(a, b+1, -1)
	
	
	def crange(a, b, i):
	    return list(range(a, b + 1, i))
	
	
	def reverse_crange(Large_a, Small_b, i):
	    return list(range(Small_b, Large_a, -i))
	
	
	# import math
	# import string
	# import fractions
	# from fractions import Fraction
	# from fractions import gcd
	
	# def lcm(n,m):
	#     return int(n*m/gcd(n,m))
	
	# import re
	# import array
	# import copy
	# import functools
	# import operator
	
	# import collections
	# import itertools
	# import bisect
	# import heapq
	
	# from heapq import heappush
	# from heapq import heappop
	# from heapq import heappushpop
	# from heapq import heapify
	# from heapq import heapreplace
	
	# from queue import PriorityQueue as pq
	
	# def reduce(p, q):
	#     common = fractions.gcd(p, q)
	#     return (p//common , q//common )
	# from itertools import accumulate
	# from collections import deque
	
	# from operator import mul
	# from functools import reduce
	
	# def combinations_count(n, r):
	#     r = min(r, n - r)
	#     numer = reduce(mul, range(n, n - r, -1), 1)
	#     denom = reduce(mul, range(1, r + 1), 1)
	#     return numer // denom
	
	# import random
	# import time
	
	
	def main():
	    s = input().strip()
	    lll = [i for i in range(1, len(s)-1)[::-2]]
	    for i in lll:
	        eprint("range", end=": ")
	        eprint(lll)
	        # closed_i = i + 1
	        if s[0: i//2] == s[i//2: i]:
	            print(i)
	            return
	        else:
	            eprint("debug ", end=": ")
	            eprint("false this time")
	    return
	
	
	if __name__ == '__main__':
	    main()
