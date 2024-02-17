class main:
	ans = 100000
	for _ in range(int(eval(input()))):
	    ans *= 1.05
	    if ans % 1000:
	        ans += 1000 - ans % 1000
	print((int(ans)))
