class main:
	H,W,K=list(map(int,input().split()))
	P,N=10**9+7,H+W
	x=K*(K+3)//2+(K**3-K)//3*H*W*pow(N*N-N,P-2,P)
	for i in range(K):x=x*(N-i)%P
	print(x)