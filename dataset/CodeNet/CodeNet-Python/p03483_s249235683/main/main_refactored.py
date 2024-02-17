class main:
	#!/usr/bin/python
	# -*- coding: utf-8 -*-
	import sys,collections,itertools,re,math,fractions,decimal,random,array,bisect,heapq,string
	
	# decimal.getcontext().prec = 50
	# sys.setrecursionlimit(10000)
	# MOD = 10**9 + 7
	
	
	def solve(f):
	    s = f.read_str()
	    n = len(s)
	    d = [collections.deque() for _ in range(26)]
	    p = [-1] * n
	
	    for i, si in enumerate(s):
	        d[ord(si)-ord('a')].append(i+1)
	
	    odd = None
	    for i in range(26):
	        if len(d[i])%2 == 1:
	            if odd is not None: return -1
	            odd = i
	
	    if odd is not None: p[n/2] = d[odd][len(d[odd])/2]
	
	    for i in range(1,n/2+1):
	        mi = float('inf')
	        si = None
	        for j in range(26):
	            if len(d[j]) < 2: continue
	            if d[j][0] < mi:
	                mi = d[j][0]
	                si = j
	
	        p[i-1] = d[si].popleft()
	        p[n-i] = d[si].pop()
	
	    return count_inversion(p)
	
	
	class BinaryIndexedTree(object):
	    """Binary Indexed Tree (1-indexed)"""
	    def __init__(self, size, default=0):
	        self.bit = [default for _ in range(size + 1)]
	        self.size = size
	
	    def sum(self, i):
	        """sum 1 to i"""
	        s = 0
	        while i > 0:
	            s += self.bit[i]
	            i -= i & -i
	        return s
	
	    def add(self, i, x):
	        """add x to bit[i]"""
	        while i <= self.size:
	            self.bit[i] += x
	            i += i & -i
	
	
	def count_inversion(a):
	    n = len(a)
	    ans = 0
	    bit = BinaryIndexedTree(n)
	    for i in range(n):
	        ans += i - bit.sum(a[i])
	        bit.add(a[i], 1)
	    return ans
	
	
	class Reader(object):
	    def __init__(self, filename=None):
	        self.file = open(filename) if filename is not None else None
	        self.case = 1
	
	    def __readline(self):
	        return self.file.next().strip() if self.file else input()
	
	    def next_case(self):
	        next(self.file)
	        self.case += 1
	
	    def read_int(self): return int(self.__readline())
	    def read_float(self): return float(self.__readline())
	    def read_long(self): return int(self.__readline())
	    def read_decimal(self): return decimal.Decimal(self.__readline())
	    def read_str(self): return self.__readline()
	
	    def read_int_list(self): return list(map(int, self.__readline().split()))
	    def read_float_list(self): return list(map(float, self.__readline().split()))
	    def read_long_list(self): return list(map(int, self.__readline().split()))
	    def read_decimal_list(self): return list(map(decimal.Decimal, self.__readline().split()))
	    def read_str_list(self): return self.__readline().split()
	
	if __name__ == '__main__':
	    filename = sys.argv[1] if len(sys.argv) > 1 else None
	    f = Reader(filename)
	    if f.file:
	        while True:
	            print("Case #%d\n"%f.case, solve(f))
	            try:
	                f.next_case()
	            except StopIteration:
	                break
	    else:
	        print(solve(f))
