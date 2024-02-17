class main:
	A, B = list(map(int, input().split()))
	
	if A >=13:
		print(B)
	elif A>=6:
		print((int(B/2)))
	else:
		print((0))