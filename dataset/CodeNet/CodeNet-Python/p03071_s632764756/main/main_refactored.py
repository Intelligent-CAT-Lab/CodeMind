class main:
	def resolve():
	    a, b = list(map(int, input().split()))
	    print((max(2*a-1, a+b, 2*b-1)))
	resolve()