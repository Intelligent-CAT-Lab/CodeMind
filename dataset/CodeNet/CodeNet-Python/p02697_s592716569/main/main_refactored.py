class main:
	n, m = list(map(int, input().split()))
	if n%2 == 1:
	    l = 1
	    r = n-1
	    for i in range(m):
	        print((l, r))
	        l += 1
	        r -= 1
	else:
	    l = 1
	    r = n-1
	    flag = False
	    for i in range(m):
	        if (not flag) and r-l <= n//2:
	            r -= 1
	            flag = True
	        print((l, r))
	        l += 1
	        r -= 1
