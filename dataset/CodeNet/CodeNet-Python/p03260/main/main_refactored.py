class main:
	a, b = list(map(int, input().split()))
	print(("Yes" if a % 2 != 0 and b % 2 != 0 else "No"))
