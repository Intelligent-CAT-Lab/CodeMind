class main:
	def check(num):
	    if num > 1:
	        for i in range(2, num):
	            if (num % i) == 0:
	                return False
	                break
	        else:
	            return True
	    else:
	        return False
	
	
	a = int(eval(input()))
	
	for i in range(a, 100500):
	    if check(i):
	        print(i)
	        break