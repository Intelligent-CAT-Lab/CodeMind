MOD = 998244353
n, a, b, k = map(int, input().split())
fac = [1] * (n + 1)
for i in range(n):
    fac[i + 1] = fac[i] * (i + 1) % MOD


def comb(n, k):
    return fac[n] * pow(fac[n - k], MOD - 2, MOD) * pow(fac[k], MOD - 2, MOD)


ans = 0
for x in range(n + 1):
    if k - x * a < 0 or (k - x * a) % b:
        continue
    y = (k - x * a) // b
    if n < y:
        continue
    ans += (comb(n, x) * comb(n, y)) % MOD
print(ans % MOD)
