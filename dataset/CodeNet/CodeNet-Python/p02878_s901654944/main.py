N, A, B = map(int, input().split())
MOD = 998244353

if B == 0:
    print(1)
    exit()

f = 1
F = [1] * (N + 1)
for i in range(1, N + 1):
    F[i] = f = f * i % MOD

FI = [1] * (N + 1)
FI[N] = fi = pow(f, MOD - 2, MOD)
for i in range(N, 1, -1):
    FI[i - 1] = fi = fi * i % MOD

z = 0
for k in range(min(A + 1, N - B) if N - B - A else A + 1):
    x = (B - k) * F[B + k - 1] * FI[B] * FI[k] % MOD
    y = F[N + A - B - 2 * k - 1] * FI[N - B - k - 1] * FI[A - k] % MOD
    z = (z + x * y) % MOD

print(z)