class main:
	fact = [1]
	for i in range(1, 101):
	    fact.append(fact[-1]*i)
	    
	def C(a, b):
	    return fact[a]//(fact[b]*fact[a-b])
	
	def sC(a, b):
	    ret = 0
	    for i in range(min(b, a-b) + 1):
	        ret += C(b, i) * C(a - b, i)
	    return ret
	
	def calc(n, k):
	    if n<=0:
	        return []
	    i = 0
	    while (1<<(i+1)) -1 <= n:
	        i += 1
	        
	    ret = [str(k)] * (i+1)
	    rem = n-((1<<i) - 1)
	    kk = k + 1
	    i += 1
	    j = i // 2
	    
	    while j > 0:
	        while True:
	            tmp = sC(i, j)
	            if tmp <= rem:
	                ret.insert(j, str(kk))
	                ret.append(str(kk))
	                kk += 1
	                rem -= tmp
	
	            else:
	                break
	                
	        j -= 1
	        
	    return ret + calc(rem, kk)
	
	N = int(eval(input()))
	
	X = calc(N, 1)
	print((len(X)))
	print((" ".join(X)))
