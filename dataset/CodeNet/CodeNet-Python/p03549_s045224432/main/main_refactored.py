class main:
	N,M=list(map(int,input().split()))
	print((((N-M)*100+M*1900)*2**M))