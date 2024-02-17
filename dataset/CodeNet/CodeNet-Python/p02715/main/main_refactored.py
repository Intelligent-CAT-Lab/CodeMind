class main:
	N, K = list(map(int, input().split()))
	P = 10 ** 9 + 7
	X = [0] * (K + 1)
	ans = 0
	for i in range(1, K + 1):
	    X[i] += i
	    for j in range(i * 2, K+1, i):
	        X[j] -= X[i]
	    ans += X[i] * pow(K//i, N, P)
	print((ans % P))