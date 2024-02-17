class main:
	import sys
	input = lambda: sys.stdin.readline().rstrip()
	N, X = list(map(int, input().split()))
	P = 998244353
	
	A = [[0] * (2*i+1) for i in range(N+1)] # A[i][j] is the number of permutations of 1's and 2's whose length is i and whose sum is j
	A[0][0] = 1
	B = [0] * (N + 1) # B[i] is the number of permutations of 1's and 2's with length i none of whose consecutive subsequenses is equal to X
	for i in range(N):
	    for j in range(i, 2*i+1):
	        A[i+1][j+1] += A[i][j]
	        A[i+1][j+2] += A[i][j]
	        if A[i+1][j+1] >= P: A[i+1][j+1] -= P
	        if A[i+1][j+2] >= P: A[i+1][j+2] -= P
	
	# Type 1: Sum is below X
	for i in range(N+1):
	    for j in range(i, min(2*i+1, X)):
	        B[i] += A[i][j]
	
	# Type 2: Sum is 2X or more
	if X % 2:
	    for i in range(X, N+1):
	        B[i] += 1
	
	# Type 3: X <= Sum < 2X
	for i in range(1, X):
	    a = X - 1 - 2 * i
	    if a < 0: continue
	    for j in range((a+1) // 2, a + 1):
	        k = j + 2 * i
	        if k > N: break
	        B[k] += A[j][a]
	        if B[k] >= P: B[k] -= P
	
	ans = 0
	for i, b in enumerate(B):
	    ans = (ans + b * A[-1][-1-i]) % P
	
	print(ans)