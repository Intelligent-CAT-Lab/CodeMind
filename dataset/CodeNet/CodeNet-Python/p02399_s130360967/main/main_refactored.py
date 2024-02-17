class main:
	a, b = list(map(int, input().split()))
	d = a // b
	r = a % b
	f = a / b
	print(f'{d} {r} {f:.5f}')
