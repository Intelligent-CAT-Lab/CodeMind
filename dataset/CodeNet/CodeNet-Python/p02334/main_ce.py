N, K = map(int, "5 3".split())
MOD = 10**9 + 7
p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD
print(p * pow(q, MOD-2, MOD) % MOD)
