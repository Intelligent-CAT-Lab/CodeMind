N, K = map(int, "5 3".split())
N = N + K
mod = 10 ** 9 + 7
P = [[0] * (K + 1) for i in range(N + 1)]
for i in range(1, N + 1):
	P[i][1] = 1
for i in range(1, min(N, K) + 1):
	P[i][i] = 1
for n in range(1, N + 1):
	for k in range(2, min(n - 1, K) + 1):
		P[n][k] = (P[n - k][k] + P[n - 1][k - 1]) % mod
print(P[N][K])
