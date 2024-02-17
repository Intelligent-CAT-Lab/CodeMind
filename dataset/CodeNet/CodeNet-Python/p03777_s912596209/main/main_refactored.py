class main:
	a, b = input().split()
	print("H" if (a == "H" and b == "H") or (a == "D" and b == "D") else "D")