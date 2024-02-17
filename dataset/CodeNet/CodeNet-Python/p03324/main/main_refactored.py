class main:
	# coding: utf-8
	D, N = list(map(int, input().split()))
	print((100 ** D * N if N != 100 else 100 ** D * (N + 1)))