class main:
	import sys
	input = sys.stdin.readline
	
	import itertools
	
	N = int(eval(input()))
	
	A = [1,2,4]
	for _ in range(12):
	    sum_2 = set(x+y for x,y in itertools.combinations(A,2))
	    avoid = set(x-y for x,y in itertools.product(sum_2,A))
	    x = min(set(range(1,1000)) - avoid - sum_2 - set(A))
	    A.append(x)
	
	L = [[0] * (N-1-i) for i in range(N)]
	
	x = 1
	for n in range(N):
	    L[n] = [x*a for a in A[:N-1-n]]
	    if n < N-2:
	        x = L[n][-1] + L[n][-2]
	
	graph = [[0] * N for _ in range(N)]
	for i in range(N):
	    for j,x in enumerate(L[i]):
	        graph[i][i+j+1] = x
	        graph[i+j+1][i] = x
	
	for row in graph:
	    print((*row))