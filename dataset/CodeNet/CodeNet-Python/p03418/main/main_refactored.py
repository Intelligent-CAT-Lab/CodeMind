class main:
	N, K = list(map(int, input().split()))
	count = 0
	
	for i in range(K + 1, N + 1):
	    count += ((N + 1) // i) * (i - K) + max(0, (N + 1) % i - K)
	
	if K == 0:
	    count -= len(list(range(K + 1, N + 1)))
	
	print (count)