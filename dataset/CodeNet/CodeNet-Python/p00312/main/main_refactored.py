class main:
	D, L = list(map(int,input().split()))
	ans = int(D/L) + (D-L*int(D/L))
	print(ans)
