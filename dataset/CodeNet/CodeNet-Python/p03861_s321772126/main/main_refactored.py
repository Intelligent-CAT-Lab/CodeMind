class main:
	def f(n,deno):
		if n == -1:
			return 0
		else:
			return n // deno + 1
	
	a, b, x = list(map(int, input().split()))
	print((f(b,x) - f(a-1, x)))