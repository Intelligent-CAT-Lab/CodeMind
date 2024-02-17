class main:
	from math import floor, ceil
	
	N, K = list(map(int, input().split()))
	
	ans = 0
	for a in range(1, N + 1):
	    if 2 * a % K != 0:
	        continue
	    ans += (floor((N + a) / K) - ceil((a + 1) / K) + 1) ** 2
	print(ans)
