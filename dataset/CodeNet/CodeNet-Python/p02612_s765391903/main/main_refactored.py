class main:
	n = int(eval(input()))
	
	if n%1000 == 0:
	    ans = 0
	else:
	    ans = 1000 - n%1000
	print(ans)
