class main:
	#!usr/bin/env python3
	from collections import defaultdict
	from collections import deque
	from heapq import heappush, heappop
	import sys
	import math
	import bisect
	import random
	def LI(): return list(map(int, sys.stdin.readline().split()))
	def I(): return int(sys.stdin.readline())
	def LS():return list(map(list, sys.stdin.readline().split()))
	def S(): return list(sys.stdin.readline())[:-1]
	def IR(n):
	    l = [None for i in range(n)]
	    for i in range(n):l[i] = I()
	    return l
	def LIR(n):
	    l = [None for i in range(n)]
	    for i in range(n):l[i] = LI()
	    return l
	def SR(n):
	    l = [None for i in range(n)]
	    for i in range(n):l[i] = S()
	    return l
	def LSR(n):
	    l = [None for i in range(n)]
	    for i in range(n):l[i] = LS()
	    return l
	sys.setrecursionlimit(1000000)
	mod = 1000000007
	
	#A
	def A():
	    e = LI()
	    d = defaultdict(int)
	    for i in e:
	        d[i] += 1
	    for i in list(d.values()):
	        if i != 2:
	            print("no")
	            break
	    else:
	        print("yes")
	    return
	
	#B
	def B():
	    n = I()
	    a = LI()
	    a.sort()
	    ans = -float("inf")
	    for c in range(n):
	        for d in range(c):
	            m = a[c]-a[d]
	            for i in range(n)[::-1]:
	                if i != c and i != d:
	                    e = i
	                    break
	            for i in range(e)[::-1]:
	                if i != c and i != d:
	                    b = i
	                    break
	            ans = max(ans, (a[e]+a[b])/m)
	    print(ans)
	    return
	
	#C
	def C():
	    def gcd(a,b):
	        if a == 0:
	            return b
	        return gcd(b%a, a)
	
	    s = eval(input())
	    n = len(s)
	    if s.count("(") == 0:
	        s = float(s)
	        b = 10**(n-2)
	        a = round(s*b)
	        g = gcd(a,b)
	        a //= g
	        b //= g
	    else:
	        n = s.find("(")
	        t = float(s[:n])
	        b = 10**(n-2)
	        a = round(t*b)
	        g = gcd(a,b)
	        a //= g
	        b //= g
	        l = (s.find("(")-s.find(".")-1)
	        s = s[n+1:-1]
	        m = len(s)
	        c = round(float(s))
	        d = (10**m-1)*10**l
	        g = gcd(c,d)
	        c //= g
	        d //= g
	        a = a*d+b*c
	        b = b*d
	        g = gcd(a,b)
	        a //= g
	        b //= g
	    print((str(a)+"/"+str(b)))
	    return
	
	#D
	def D():
	    return
	
	#E
	def E():
	    def dfs(d,k,s):
	        if d == n:
	            ans.append(k)
	        else:
	            b = [block[d][i] for i in range(8)]
	            if sum(b[:4]) == 0:
	                b = b[4:]+[0,0,0,0]
	            dfs(d+1,*check(b,k,s))
	            if not (b[0]|b[1]|b[4]|b[5]):
	                b_ = [b[2],b[3],0,0,b[6],b[7],0,0]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[1]|b[3]|b[5]|b[7]):
	                b_ = [0,b[0],0,b[2],0,b[4],0,b[6]]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[2]|b[3]|b[6]|b[7]):
	                b_ = [0,0,b[0],b[1],0,0,b[4],b[5]]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[0]|b[2]|b[4]|b[6]):
	                b_ = [b[1],0,b[3],0,b[5],0,b[7],0]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[1]|b[2]|b[3]|b[5]|b[6]|b[7]):
	                b_ = [0,0,0,b[0],0,0,0,b[4]]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[0]|b[2]|b[3]|b[4]|b[6]|b[7]):
	                b_ = [0,0,b[1],0,0,0,b[5],0]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[0]|b[1]|b[3]|b[4]|b[5]|b[7]):
	                b_ = [0,b[2],0,b[6],0,0,0,0]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	            if not (b[0]|b[1]|b[2]|b[4]|b[5]|b[6]):
	                b_ = [b[3],0,0,0,b[7],0,0,0]
	                if sum(b_):
	                    dfs(d+1,*check(b_,k,s))
	    def check(b,k,s):
	        i = 19
	        k_ = k
	        s_ = [[s[i][j] for j in range(4)] for i in range(20)]
	        while i >= 1 and not ((b[0]&s[i-1][0])|(b[1]&s[i-1][1])|(b[2]&s[i-1][2])|(b[3]&s[i-1][3])|(b[4]&s[i][0])|(b[5]&s[i][1])|(b[6]&s[i][2])|(b[7]&s[i][3])):
	            i -= 1
	        s_[i] = [s_[i][j]+b[j] for j in range(4)]
	        s_[i+1] = [s_[i+1][j]+b[j+4] for j in range(4)]
	        i = 0
	        while i < 20:
	            if sum(s_[i]) == 4:
	                k_ += 1
	                for j in range(i,19):
	                    s_[j] = [s_[j+1][l] for l in range(4)]
	                s_[19] = [0,0,0,0]
	                i -= 1
	            i += 1
	        return k_,s_
	
	    while 1:
	        h,n = LI()
	        if h == n == 0:
	            break
	        s = [[0,0,0,0] for i in range(20)]
	        for i in range(h):
	            c = S()
	            c += S()
	            s[i] = [1 if c[j] == "#" else 0 for j in range(4)]
	        block = [[0,0,0,0,0,0,0,0] for i in range(n)]
	        for i in range(n):
	            b = S()
	            b += S()
	            b += S()
	            b += S()
	            block[i] = [1 if b[j] == "#" else 0 for j in range(8)]
	        ans = []
	        dfs(0,0,s)
	        print((max(ans)))
	    return
	
	#F
	def F():
	    def dfs(d,k):
	        if d == len(s):
	            t.append(k)
	        else:
	            if s[d] == ".":
	                for i in range(2):
	                    dfs(d+1,k+[str(i)])
	                for i in "+-*()":
	                    dfs(d+1,k+[i])
	            else:
	                dfs(d+1,k+[s[d]])
	
	    def parse_expr(s,i):
	        if i == float("inf"):
	            return -1,float("inf")
	        f = s[i-1] == "("
	        k = 0
	        t,i,k = parse_term(s,i,k)
	        while i < len(s) and s[i] in "+-":
	            k += 1
	            op,i = parse_op(s,i)
	            t_,i,k = parse_term(s,i,k)
	            t = calc(op,t,t_)
	            if t >= 1024 or t < 0:
	                return -1,float("inf")
	        if f and not k:
	            return -1,float("inf")
	        return t,i
	
	    def parse_term(s,i,k):
	        f,i = parse_factor(s,i)
	        while i < len(s) and s[i] == "*":
	            k += 1
	            op,i = parse_op(s,i)
	            f_,i = parse_factor(s,i)
	            f = calc(op,f,f_)
	            if f >= 1024 or f < 0:
	                return -1,float("inf"),k
	        return f,i,k
	
	    def parse_op(s,i):
	        return s[i],i+1
	
	    def parse_factor(s,i):
	        if i >= len(s):
	            return -1,float("inf")
	        if s[i] == "(":
	            i += 1
	            e,i = parse_expr(s,i)
	            if i >= len(s) or s[i] != ")":
	                return -1,float("inf")
	            i += 1
	            return e,i
	        else:
	            if not s[i].isdecimal():
	                return -1,float("inf")
	            n = int(s[i])
	            i += 1
	            while i < len(s) and s[i].isdecimal():
	                n *= 2
	                n += int(s[i])
	                i += 1
	            if n >= 1024 or n < 0:
	                return -1,float("inf")
	            return n,i
	
	    def calc(op,a,b):
	        if op == "+":
	            return a+b
	        elif op == "-":
	            return a-b
	        elif op == "*":
	            return a*b
	
	
	    s = S()
	    f = defaultdict(lambda : 0)
	    for i in range(2):
	        f[str(i)] += 1
	    t = []
	    dfs(0,[])
	    ans = -1
	    for s in t:
	        e,i = parse_expr(s,0)
	        if i == len(s):
	            ans = max(ans,e)
	    print(ans)
	    return
	
	#G
	def G():
	    return
	
	#H
	def H():
	    return
	
	#I
	def I_():
	    return
	
	#J
	def J():
	    return
	
	#Solve
	if __name__ == "__main__":
	    F()
	
