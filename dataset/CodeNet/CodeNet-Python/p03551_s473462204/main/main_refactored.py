class main:
	n,m=list(map(int,input().split()))
	submit=m*1900+(n-m)*100
	print((submit*2**m))