class main:
	N=eval(input())
	
	memo={}
	memo[0]=1
	memo[1]=2
	
	def func(N):
		if N in memo:
			return memo[N]
		result= ( func(N/2)+func((N-1)/2)+func(N/2-1) )% (10**9+7)
		
		memo[N]=result
		return result
	
	print(func(N))
