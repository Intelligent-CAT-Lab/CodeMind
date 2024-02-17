class main:
	#!/usr/bin/python
	# -*- coding: utf-8 -*-
	import sys,collections,itertools,re,math,fractions,decimal,random,array,bisect,heapq
	
	# decimal.getcontext().prec = 50
	# sys.setrecursionlimit(10000)
	MOD = 10**9 + 7
	
	def solve(f):
	    n = f.read_int()
	
	    fact = [1] * (n+1)
	    ifact = [1] * (n+1)
	    for i in range(1, n+1):
	        fact[i] = (fact[i-1] * i) % MOD
	        ifact[i] = pow(fact[i], MOD-2, MOD)
	
	    def nCk(n, k):
	        if k < 0 or k > n: return 0
	        return (fact[n] * ifact[n-k] * ifact[k]) % MOD
	
	    ans = 0
	    c0 = 0
	    for i in range(n/2,n):
	        c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + MOD) % MOD
	        ans = (ans + c1*i) % MOD
	        c0 = (c0 + c1) % MOD
	
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
