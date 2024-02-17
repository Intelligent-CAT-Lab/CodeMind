class main:
	prime = [2]
	def check(x):
	    for i in prime:
	        if x % i ==0:
	            return False
	        elif x < i * i:
	            break
	    return True
	
	def set():
	    for i in range(3,10**5,2):
	        if check(i):
	            prime.append(i)
	
	
	set()
	#print('ok')
	#print(prime)
	p,q = [int(i) for i in input().split(' ')]
	if q % p == 0:
	    q = q //p
	    p = 1
	for i in prime:
	    while True:
	        if p % i ==0 and q % i == 0:
	            p = p // i
	            q = q // i
	            #print(p,q,i)
	        else:
	            break
	 
	ans = 1
	#print(p,q)
	for i in prime:
	    if q % i == 0:
	#        print(q,i)
	        q = q // i
	        ans *= i
	        while q % i ==0:
	            q = q // i
	            
	ans *= q
	    
	
	print(ans)
	
