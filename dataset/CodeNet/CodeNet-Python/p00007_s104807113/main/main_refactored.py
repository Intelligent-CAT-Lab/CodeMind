class main:
	import math
	
	def main():
	    n = int(eval(input()))
	    _debt = 100000
	    for i in range(n):
	        _debt += math.ceil(_debt*0.05*0.001)*1000
	    print(_debt)
	
	
	
	if __name__ == '__main__':
	    main()