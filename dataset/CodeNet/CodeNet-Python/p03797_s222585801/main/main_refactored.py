class main:
	N, M = list(map(int, input().split()))
	
	count = 0
	if N >= M:
	    count += M//2
	elif N*2 <= M:
	    count += N
	    M = M - N*2
	    count += M//4
	
	print(count)