class main:
	import math
	
	def gcd(a,b):
	    """Compute the greatest common divisor of a and b"""
	    while b > 0:
	        a, b = b, a % b
	    return a
	 
	def lcm(a, b):
	    """Compute the lowest common multiple of a and b"""
	    return a * b / gcd(a, b)
	 
	
	def f(b,n):
		if n < b:
			return n
		return f(b, n//b) + n%b
	 
	N,K = list(map(int,input().split()))
	
	if(K%2==0):
	    cnt1=0
	    cnt2=0
	    for a in range(1,N+1):
	        if(a%K==0):
	            cnt1+=1
	        elif(a%K==K/2):
	            cnt2+=1
	
	    print((cnt1**3+cnt2**3))
	
	else:
	    cnt=0
	    for a in range(1,N+1):
	        if(a%K==0):
	            cnt+=1
	    print((cnt**3))
	
	
