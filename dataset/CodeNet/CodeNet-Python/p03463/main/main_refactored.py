class main:
	a,b,c=[int(i) for i in input().split()]
	if abs(b-c)%2==0:
		print("Alice")
	else:
		print("Borys")