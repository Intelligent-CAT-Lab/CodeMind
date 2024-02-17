class main:
	def solve(n, d, x):
	    ans = 0
	    while n:
	        ans += d + (2 * n - 1) * x / 2
	        d = ((n + 1) * d + 5 * x / 2) / n
	        x *= (n + 2) / n
	        n -= 1
	    return ans
	
	
	print(('{:.10f}'.format(solve(*list(map(float, input().split()))))))
