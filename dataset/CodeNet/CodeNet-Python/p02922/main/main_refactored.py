class main:
	a, b = list(map(int, input().split()))
	total = 1
	ans = 0
	
	while total < b:
	    ans += 1
	    total += a-1
	
	print(ans)
