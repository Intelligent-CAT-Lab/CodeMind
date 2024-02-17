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
	def S(): return list(sys.stdin.readline())[:-1]
	def IR(n):
	    return [I() for i in range(n)]
	def LIR(n):
	    return [LI() for i in range(n)]
	def SR(n):
	    return [S() for i in range(n)]
	def LSR(n):
	    return [LS() for i in range(n)]
	
	sys.setrecursionlimit(1000000)
	
	#A
	def A():
	    n = I()
	    if n <= 1000000000:
	        print((0,0,1,0,0,n))
	    else:
	        b = math.ceil(n**0.5)
	        if b**2 == n:
	            print((0,0,b,0,0,n//b))
	            return
	        x = b
	        m = b*x-n
	        if m < 0:
	            b += 1
	            x += 1
	            m = b*x-n
	        n = m
	        for a in range(int(n**0.5)+1)[::-1]:
	            if n%a == 0:
	                print((0,0,x,n//a,a,b))
	                return
	
	    return
	
	#B
	def B():
	    n,k = LI()
	    a = LI()
	    s = []
	    f = [1]*1000000
	    for i in range(k):
	        for j in range(n):
	            aj = a[j]
	            if f[aj]:
	                s.append(aj)
	                f[aj] = 0
	            else:
	                while 1:
	                    x = s.pop(-1)
	                    f[x] = 1
	                    if x == aj:
	                        break
	        print((i+1,s))
	    return
	
	#C
	mod = 998244353
	def C():
	    def comb(a,b):
	        if a < b:
	            return 1
	        return fact[a]*inv[b]*inv[a-b]%mod
	    n,m = LI()
	    MA = 3*m+max(n,2*m)-1
	    fact = [1]*(MA+1)
	    for i in range(MA):
	        fact[i+1] = fact[i]*(i+1)%mod
	    inv = [1]*(MA+1)
	    inv[MA] = pow(fact[MA],mod-2,mod)
	    for i in range(MA)[::-1]:
	        inv[i] = inv[i+1]*(i+1)%mod
	    ans = 0
	    for k in range(min(m,n)+1):
	        if (3*m-k)%2 == 0:
	            ans += comb(n,k)*comb((3*m-k)//2+n-1,n-1)
	            ans %= mod
	    ans -= n*comb(3*m-(2*m+1)+n-1,n-1)
	    ans %= mod
	    print(ans)
	
	    return
	
	#D
	def D():
	    return
	
	#E
	def E():
	    n = I()
	
	    return
	
	#F
	def F():
	    n = I()
	
	    return
	
	#Solve
	if __name__ == "__main__":
	    C()
