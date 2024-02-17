class main:
	# coding: utf-8
	# Your code here!
	import sys
	read = sys.stdin.read
	readline = sys.stdin.readline
	
	def f(i,d):
	    """
	    i 桁の n で、r(n)-n = d
	    """
	    n = i-1
	    m = 0
	    res = []
	    while n>m:
	        x = 10**n-10**m
	        if m:
	            res.append(tuple((x*k,v) for k,v in list(d2.items())))
	        else:
	            res.append(tuple((x*k,v) for k,v in list(d1.items())))
	        n -= 1
	        m += 1
	    
	    def sums(lsts):
	        dic = {0:1}
	        for lst in lsts:
	            ndic = {}
	            for k1,v1 in list(dic.items()):
	                for k2,v2 in lst:
	                    k = k1+k2
	                    v = v1*v2
	                    if k in ndic: ndic[k] += v
	                    else: ndic[k] = v
	            dic = ndic
	        
	        return list(dic.items())
	    
	    L = len(res)
	    #print(res[L//2:])
	    s1 = sums(res[:L//2])
	    s2 = sorted(sums(res[L//2:]))
	    
	    #print(s1)
	    #print(s2)
	    #print(d)
	
	    v = 0
	    from bisect import bisect_left
	    for k1,v1 in s1:
	        idx = bisect_left(s2,(d-k1,0))
	        if idx < len(s2) and s2[idx][0] == d-k1:
	            #print(k1,v1,idx,s2[idx])
	            v += v1*s2[idx][1]
	    return v*(1 if i%2==0 else 10)
	
	
	d, = list(map(int,read().split()))
	
	ans = 0
	
	from collections import Counter
	
	d1 = Counter()
	for i in range(10):
	    for j in range(1,10):
	        d1[i-j] += 1
	        
	d2 = Counter()
	for i in range(10):
	    for j in range(10):
	        d2[i-j] += 1
	
	for i in range(2,18):
	#for i in range(2,19):
	    r = f(i,d)    
	    #print(r,i)
	    ans += r
	if d%(10**9-10**8)==0:
	    r = d//(10**9-10**8)
	    ans += d2[r]*(10**7)*9
	
	print(ans)
	
	
	
	
