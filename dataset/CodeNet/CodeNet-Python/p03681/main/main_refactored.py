class main:
	from math import factorial
	MAX = 10**9+7
	N, M = list(map(int, input().split()))
	diff = N-M
	if abs(diff)>1:
	    print((0))
	elif diff == 0:
	    print((factorial(N)*factorial(M)*2%MAX))
	else:
	    print((factorial(N)*factorial(M)%MAX))