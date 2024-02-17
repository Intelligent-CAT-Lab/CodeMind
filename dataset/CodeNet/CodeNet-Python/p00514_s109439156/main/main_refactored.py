class main:
	n,m,r=list(map(int,input().split()))
	r-=m*n
	if r<0:print((0))
	else:
	 a=1
	 for i in range(r):a*=i+n
	 for i in range(r):a//=i+1
	 print(a)
