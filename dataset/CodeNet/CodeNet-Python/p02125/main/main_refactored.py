class main:
	N = int(eval(input()))
	ans = 0
	x = 1
	while 2*x-1 <= N:
	    x = 2*x
	    ans += 1
	print(ans)
	
