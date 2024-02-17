N, A, B, C, D = map(int, "3 1 3 1 2".split())
MOD = 10 ** 9 + 7
fact = [1] * (N + 1)
frev = [1] * (N + 1)
dp = [0] * (N + 1)
dp[0] = 1
for i in range(1, N + 1):
    v = fact[i] = (fact[i - 1] * i) % MOD
    frev[i] = pow(v, MOD - 2, MOD)
Y = [None] * (N + 1)
for g in range(A, min(N // C, B) + 1):
    p = C * g
    q = D * g
    y = frev[g]
    Y[p: min(q, N) + 1: g] = (pow(y, j, MOD) * frev[j]
                              for j in range(C, min(D, N // g) + 1))
    dp[p:] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
              for j in range(p, min(q, i) + 1, g)) % MOD
              for i in range(p, N + 1))
print(dp[N] % MOD)