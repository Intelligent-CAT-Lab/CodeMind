import sys
K, A, B = "4 2 6".split(" ")
k = long(K)
a = long(A)
b = long(B)
if (b-a) >= 2:
	hitsteps = a - 1
	leftoversteps = k - hitsteps
	rem = (leftoversteps)%2
	swaps = (leftoversteps-rem)/2
	multbiscuits = swaps * (b-a)
	print(int(multbiscuits+rem+a))
else:
	print(int(k+1))