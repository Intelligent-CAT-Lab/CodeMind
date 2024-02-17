class main:
	n, m = list(map(int, input().split()))
	print((min(n % m, -n % m)))