N, K = map(int, "4 3".split())
MOD = 10**9 + 7
D = [[0]*(K+1) for i in range(N+1)]
D[0][0] = 1
for n in range(1, N+1):
    D0 = D[n-1]
    for k in range(1, K+1):
        D[n][k] = (D0[k-1] + k * D0[k]) % MOD
print(D[N][K])
