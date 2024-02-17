class main:
	def contains3(n):
	    x = n
	    while x > 0:
	        if x % 10 == 3:
	            return True
	        else:
	            x //= 10
	    return False
	
	x = int(eval(input()))
	out = ""
	for i in range(x):
	    n = i + 1
	    if n % 3 == 0 or contains3(n):
	        out += (" %d" % n)
	print(out)