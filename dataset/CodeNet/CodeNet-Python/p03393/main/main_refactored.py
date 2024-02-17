class main:
	import sys, re, os
	from collections import deque, defaultdict, Counter
	from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians, acos, atan, asin
	from itertools import permutations, combinations, product, accumulate
	from operator import itemgetter, mul
	from copy import deepcopy
	from string import ascii_lowercase, ascii_uppercase, digits
	from fractions import gcd
	def input(): return sys.stdin.readline().strip()
	def STR(): return eval(input())
	def INT(): return int(eval(input()))
	def MAP(): return list(map(int, input().split()))
	def S_MAP(): return list(map(str, input().split()))
	def LIST(): return list(map(int, input().split()))
	def S_LIST(): return list(map(str, input().split()))
	sys.setrecursionlimit(10 ** 9)
	inf = sys.maxsize
	mod = 10 ** 9 + 7
	
	s = STR()
	if len(s) < 26:
	    for i in range(26):
	        tmp = chr(i + ord('a'))
	        if not tmp in s:
	            print((s + tmp))
	            exit()
	else:
	    for i in reversed(list(range(26))):
	        for j in range(ord(s[i]) + 1, ord('z') + 1):
	            if not chr(j) in s[:i]:
	                print((s[:i] + chr(j)))
	                exit()
	    print((-1))
	    exit()