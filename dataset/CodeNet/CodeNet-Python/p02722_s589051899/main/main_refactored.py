class main:
	N = int(eval(input()))
	
	def f(N, i):
	    if i == 1:
	        return False
	    while N%i == 0:
	        N //= i
	    if N%i == 1:
	        return True
	    else:
	        return False
	        
	ans = 0
	i = 1
	while i <= N**0.5:
	    if N%i > 0:
	        i += 1
	        continue
	    if f(N, i):
	        ans += 1
	    if i%(N//i) == 1:
	        ans += 1
	    i += 1
	
	i = 1
	while i <= (N-1)**0.5:
	    if (N-1)%i > 0:
	        i += 1
	        continue
	    if N%i == 1 and N//i != i:
	        ans += 1
	    if N%((N-1)//i) == 1:
	        ans += 1
	    i += 1
	
	print(ans)