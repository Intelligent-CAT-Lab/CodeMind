class main:
	N, K = list(map(int,input().split()))
	ans1 = 0
	ans2 = 0
	if K % 2 == 0:
	    for i in range(1,N+1):
	        if i % K == 0:
	            ans1 += 1
	        if i % K == K//2:
	            ans2 += 1
	else:
	    for i in range(1,N+1):
	        if i % K == 0:
	            ans1 += 1
	
	print((ans1**3 + ans2**3))