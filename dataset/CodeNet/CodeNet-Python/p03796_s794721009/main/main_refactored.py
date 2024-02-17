class main:
	import sys
	N=int(eval(input()))
	power=1
	for i in range(N):
	    power*=(i+1)
	    power%=10**9+7
	print(power)