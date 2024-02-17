class main:
	#!usr/bin/env python3
	from collections import defaultdict,deque
	from heapq import heappush, heappop
	import sys
	import math
	import bisect
	import random
	def LI(): return [int(x) for x in sys.stdin.readline().split()]
	def I(): return int(sys.stdin.readline())
	def LS():return [list(x) for x in sys.stdin.readline().split()]
	def S():
	    res = list(sys.stdin.readline())
	    if res[-1] == "\n":
	        return res[:-1]
	    return res
	def IR(n):
	    return [I() for i in range(n)]
	def LIR(n):
	    return [LI() for i in range(n)]
	def SR(n):
	    return [S() for i in range(n)]
	def LSR(n):
	    return [LS() for i in range(n)]
	
	sys.setrecursionlimit(1000000)
	mod = 998244353
	
	
	def solve():
	    m,n,k = LI()
	    if n < k:
	        print((0))
	        return
	    if m < k:
	        print((0))
	        return
	    ans = pow(m,n,mod)
	    p = [pow(i,n,mod) for i in range(k+1)]
	    c = m
	    comb = [[0 for i in range(i+1)] for i in range(k+1)]
	    comb[0][0] = 1
	    for i in range(k):
	        for j in range(i+1):
	            comb[i+1][j] += comb[i][j]
	            comb[i+1][j+1] += comb[i][j]
	    for i in range(1,k):
	        k = 0
	        for j in range(1,i+1)[::-1]:
	            if (i+j)&1:
	                k -= comb[i][j]*p[j]
	            else:
	                k += comb[i][j]*p[j]
	        k *= c
	        c *= (m-i)
	        c *= pow(i+1,mod-2,mod)
	        c %= mod
	        ans -= k
	        ans %= mod
	    print(ans)
	    return
	
	
	if __name__ == "__main__":
	    solve()
	
