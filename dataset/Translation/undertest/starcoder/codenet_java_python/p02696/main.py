a,b,n=map(int,input().split())
if n>=b:
	print(a*(b-1)//b)
else:
	print(a*n//b)