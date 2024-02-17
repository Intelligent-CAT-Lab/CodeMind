class main:
	n, a, b = list(map(int, input().split()))
	
	diff = b - a
	
	if diff % 2 == 0:
		print((diff//2))
	else:
		if a < n - b + 1:
			if diff > 0:
				print((a + (diff-1)//2))
			else:
				print(a)
		else:
			if diff > 0:
				print((n-b+1 + (diff)//2))
			else:
				print((n-b+1))
			
