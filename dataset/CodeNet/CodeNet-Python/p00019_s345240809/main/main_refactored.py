class main:
	def factorial(n):
	    if n == 1:
	        return 1
	    else:
	        return n * factorial(n-1)
	n=eval(input())
	print((factorial(int(n))))