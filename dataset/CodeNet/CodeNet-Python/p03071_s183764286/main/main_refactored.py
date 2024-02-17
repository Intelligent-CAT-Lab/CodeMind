class main:
	a,b = list(map(int,input().split()))
	#s = input()
	res = 0
	res += max(a,b)
	a,b = max(a,b)-1,min(a,b)
	res += max(a,b)
	print(res)
