class main:
	A,B = list(map(int,input().split()))
	
	a1 = A + B
	a2 = A - B
	a3 = A * B
	
	if a1 >= a2 and a1 >= a3:
		print(a1)
	elif a2 >= a1 and a2>= a3:
		print(a2)
	elif a3 >= a1 and a3 >= a2:
		print(a3)