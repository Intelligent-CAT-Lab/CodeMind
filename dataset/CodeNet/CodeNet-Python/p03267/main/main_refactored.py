class main:
	# coding: utf-8
	import sys
	
	sr = lambda: sys.stdin.readline().rstrip()
	ir = lambda: int(sr())
	lr = lambda: list(map(int, sr().split()))
	
	L = ir()
	edges = []
	length = L.bit_length()
	for i in range(1, length):
	    edges.append((i, i+1, 2**(i-1)))
	    edges.append((i, i+1, 0))
	
	# 2**(length-1)-1までの数は完了
	# Lに近い切れ端から処理していく
	for i in range(length-1):
	    if L >> i & 1:
	        L -= 2 ** i
	        edges.append((i+1, length, L))
	
	print((length, len(edges)))
	for x in edges:
	    print((*x))
