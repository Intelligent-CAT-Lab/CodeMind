class main:
	import math
	n, p = list(map(int, input().split()))
	if n==1:
		print(p)
	else:
		ans = 1
		limit = math.ceil(p**(1/n))
		while(limit>1):
			cnt = 0
			a = p
			while(a!=0):
				if a%limit == 0:
					cnt += 1
					a = a // limit
				else:
					break
			if cnt >= n:
				ans = limit
				break
			limit -= 1
		print(ans)