class main:
	def main():
	    n = int(eval(input()))
	
	    A = [0] * (10 ** 6)
	    for x in range(1, 10 ** 2 + 1):
	        for y in range(1, 10 ** 2 + 1):
	            for z in range(1, 10 ** 2 + 1):
	                i = x ** 2 + y ** 2 + z ** 2 + x*y + y*z + z*x
	                A[i] += 1
	
	    for i in range(1, n + 1):
	        print((A[i]))
	
	
	if __name__ == '__main__':
	    main()
