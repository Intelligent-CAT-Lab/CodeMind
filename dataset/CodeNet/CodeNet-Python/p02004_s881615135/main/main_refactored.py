class main:
	#!usr/bin/env python3
	from collections import defaultdict
	from collections import deque
	from heapq import heappush, heappop
	import sys
	import math
	import bisect
	import random
	import itertools
	sys.setrecursionlimit(10**5)
	stdin = sys.stdin
	bisect_left = bisect.bisect_left
	bisect_right = bisect.bisect_right
	def LI(): return list(map(int, stdin.readline().split()))
	def LF(): return list(map(float, stdin.readline().split()))
	def LI_(): return list([int(x)-1 for x in stdin.readline().split()])
	def II(): return int(stdin.readline())
	def IF(): return float(stdin.readline())
	def LS(): return list(map(list, stdin.readline().split()))
	def S(): return list(stdin.readline().rstrip())
	def IR(n): return [II() for _ in range(n)]
	def LIR(n): return [LI() for _ in range(n)]
	def FR(n): return [IF() for _ in range(n)]
	def LFR(n): return [LI() for _ in range(n)]
	def LIR_(n): return [LI_() for _ in range(n)]
	def SR(n): return [S() for _ in range(n)]
	def LSR(n): return [LS() for _ in range(n)]
	mod = 1000000007
	inf = float('INF')
	
	#A
	def A():
	    s = S()
	    i = 0
	    now = 0
	    ans = 0
	    while i < len(s):
	        if s[i] == "R":
	            if now == 0:
	                now += 1
	                i += 1
	                while i < len(s):
	                    if s[i] == "R":
	                        now += 1
	                    else:
	                        now -= 1
	                    now = now % 4
	                    i += 1
	                    if now == 0:
	                        if s[i-1] == "R":
	                            ans += 1
	                        break
	
	            else:
	                now += 1
	                now = now % 4
	                i += 1
	        else:
	            now -= 1
	            now = now % 4
	            i += 1
	
	    print(ans)
	
	
	    return
	
	#B
	def B():
	    return
	
	#C
	def C():
	    return
	
	#D
	def D():
	    return
	
	#E
	def E():
	    return
	
	#F
	def F():
	    return
	
	#G
	def G():
	    return
	
	#H
	def H():
	    return
	
	#Solve
	if __name__ == '__main__':
	    A()
	
