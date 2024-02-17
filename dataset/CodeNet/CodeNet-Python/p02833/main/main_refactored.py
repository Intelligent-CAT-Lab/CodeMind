class main:
	###### Importing Libraries ######
	import math
	import operator as op
	from functools import reduce
	from fractions import Fraction as frac
	#################################
	##### User defined function #####
	
	############ NCR ###############
	def ncr(n, r):
	    r = min(r, n-r)
	    numer = reduce(op.mul, list(range(n, n-r, -1)), 1)
	    denom = reduce(op.mul, list(range(1, r+1)), 1)
	    return numer / denom
	    
	############ READ ###############
	def rd(p):
	    if(p==0):
	        return eval(input())
	    if(p==1):
	        return int(eval(input()))
	    if(p==2):
	        return list(map(int,input().split()))
	    if(p==3):
	        return list(map(int,input().split()))
	
	
	############ DSU ###############
	global par
	par=[-1 for i in range(100001)]
	# t=rd(1)
	def find(u):
	    if(par[u]<0):
	        return u
	    else:
	        return find(par[u])
	def uni(x,y):
	    u=find(x)
	    v=find(y)
	    if u==v:
	        return
	    if(par[u]<par[v]):
	        par[u]+=par[v]
	        par[v]=u
	    else:    
	        par[v]+=par[u]
	        par[u]=v
	################################        
	        
	
	t=1
	for term in range(1,t+1):
	    n=rd(1)
	    div=10
	    tot=0
	    if n%2==1:
	        print((0))
	    else:    
	        while(n>=div):
	            # print(n//div)
	            tot+=(n//div)
	            div*=5
	        print(tot)
	    
	        
	    
	    