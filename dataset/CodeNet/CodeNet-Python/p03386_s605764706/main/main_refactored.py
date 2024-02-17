class main:
	A, B, K = list(map(int, input().split()))
	
	A_th = B+1 if A+K > B+1 else A+K
	A_l = list(range(A, A_th, 1))
	#print(A_l)
	
	B_th = B-K+1 if B-K > A-1 else A
	B_l = list(range(B_th, B+1, 1))
	#print(B_l)
	
	X_l = sorted(set(A_l + B_l))
	
	for x in X_l:
	  print(x)