class main:
	import os
	import sys
	
	import numpy as np
	
	if os.getenv("LOCAL"):
	    sys.stdin = open("_in.txt", "r")
	
	sys.setrecursionlimit(2147483647)
	INF = float("inf")
	IINF = 10 ** 18
	MOD = 10 ** 9 + 7
	
	H, W, D = list(map(int, sys.stdin.readline().split()))
	
	X, Y = np.meshgrid(np.arange(H), np.arange(W))
	X, Y = X + Y, X - Y
	X = X.ravel()
	Y = Y.ravel()
	colors = np.zeros(H * W, dtype=str)
	
	if D % 2 == 1:
	    colors[X % 2 == 1] = 'R'
	    colors[X % 2 == 0] = 'Y'
	else:
	    colors[(X % (D * 2) < D) & (Y % (D * 2) < D)] = 'R'
	    colors[(X % (D * 2) < D) & (Y % (D * 2) >= D)] = 'Y'
	    colors[(X % (D * 2) >= D) & (Y % (D * 2) < D)] = 'G'
	    colors[(X % (D * 2) >= D) & (Y % (D * 2) >= D)] = 'B'
	
	x, y = (X + Y) // 2, (X - Y) // 2
	ans = np.zeros((H, W), dtype=str)
	ans[x, y] = colors
	print(('\n'.join([''.join(r) for r in ans])))
