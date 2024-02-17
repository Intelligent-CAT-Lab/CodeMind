class main:
	a, b, c = list(map(int, input().split()))
	
	print("Yes" if c >= a and c <= b else "No")
