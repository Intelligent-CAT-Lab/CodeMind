class main:
	
	import sys
	def input():
		return sys.stdin.readline().strip()
	
	N = int(eval(input()))
	
	def sum_N(N):
		total = 0
		x = N
		while x > 0:
			total += x % 10
			x = x // 10
		return total
	
	ans = 1000000000000
	for i in range(1, N):
		ans = min(ans, sum_N(i) + sum_N(N - i))
	
	print(ans)