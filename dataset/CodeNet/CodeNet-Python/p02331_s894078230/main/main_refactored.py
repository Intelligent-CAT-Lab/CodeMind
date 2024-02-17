class main:
	n, k = list(map(int,input().split()))
	
	mod = int(1e9+7)
	ans = 1
	while (n > 0):
	    if (n % 2 == 1):
	        ans = (ans * k) % mod
	    k = (k * k) % mod
	    n = n // 2
	print(ans)
	
	
