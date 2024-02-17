class main:
	import math
	import sys
	import queue
	from collections import Counter
	from itertools import accumulate
	from fractions import gcd
	from functools import reduce
	
	def lcm(a, b):
	    return a * b // gcd(a, b)
	
	def combination_count(n, r):
	    return math.factorial(n) // (math.factorial(n - r) * math.factorial(r))
	
	def permutations_count(n, r):
	    return math.factorial(n) // math.factorial(n - r)
	
	mod = 1000000007
	
	"""
	# 標準入力取得
	## 文字列
	    = sys.stdin.readline().rstrip()
	    = list(sys.stdin.readline().rstrip())
	
	## 数値
	    = int(sys.stdin.readline())
	    = map(int, sys.stdin.readline().split())
	    = list(map(int, sys.stdin.readline().split()))
	    = [list(map(int,list(sys.stdin.readline().split()))) for i in range(N)]
	"""
	
	if __name__ == "__main__":
	    R = int(sys.stdin.readline())
	    if 0 <= R < 1200:
	        print("ABC")
	    elif 1200 <= R < 2800:
	        print("ARC")
	    else:
	        print("AGC")
	
