class main:
	import sys
	from collections import deque
	#import numpy as np
	import math
	#sys.setrecursionlimit(10**6)
	def S(): return sys.stdin.readline().rstrip()
	def SL(): return list(map(str,sys.stdin.readline().rstrip().split()))
	def I(): return int(sys.stdin.readline().rstrip())
	def IL(): return list(map(int,sys.stdin.readline().rstrip().split()))
	
	def solve():
	    m = 1
	    pre = s
	    st = {s}
	    while True:
	        m += 1
	        if pre%2==0:
	            tmp = pre/2
	        else:
	            tmp = 3*pre+1
	        if tmp in st:
	            print(m)
	            return
	        pre = tmp
	        st.add(tmp)
	    return
	
	if __name__=='__main__':
	    s = I()
	    solve()