class main:
	def INT():
	    return int(eval(input()))
	
	def MI():
	    return list(map(int, input().split()))
	
	def LI():
	    return list(map(int, input().split()))
	
	N, M = MI()
	
	if 2 * N <= M:
	    ans = N + (M - 2 * N) // 4
	    
	else:
	    ans = M // 2
	    
	print(ans)