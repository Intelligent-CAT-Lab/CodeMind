class main:
	import sys
	
	K, A, B = sys.stdin.readline().split(" ")
	k = int(K)
	a = int(A)
	b = int(B)
	
	if (b-a) >= 2:
		hitsteps = a - 1
		leftoversteps = k - hitsteps
		rem = (leftoversteps)%2
		swaps = (leftoversteps-rem)/2
		multbiscuits = swaps * (b-a)
		print((int(multbiscuits+rem+a)))
	else:
		print((int(k+1)))