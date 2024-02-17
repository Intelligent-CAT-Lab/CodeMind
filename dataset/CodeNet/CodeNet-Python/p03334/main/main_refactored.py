class main:
	from math import sqrt
	from itertools import product
	
	import numpy as np
	
	def judge(D):
	  n = 1
	  while D%4==0:
	    n *= 2
	    D //= 4
	
	  def h1(x,y):
	    return ~(x//n+y//n)%2
	  def h2(x,y):
	    return ~(x//n)%2
	
	  return h1 if D%2==1 else h2
	
	N,D1,D2 = list(map(int,input().split()))
	j1,j2 = judge(D1),judge(D2)
	cnt = 0
	for x,y in product(list(range(N*2)),repeat=2):
	  if j1(x,y) and j2(x,y):
	    print((x,y))
	    cnt += 1
	    if cnt >= N*N:
	      break
