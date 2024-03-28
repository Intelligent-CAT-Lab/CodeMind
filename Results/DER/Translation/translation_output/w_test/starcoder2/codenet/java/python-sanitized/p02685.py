import math

n, m, k = map(int, input().split())

mod = 998244353

fact = [0] * (n + 1)
ifact = [0] * (n + 1)

fact[0] = fact[1] = ifact[0] = ifact[1] = 1

for i in range(2, n + 1):
    fact[i] = (fact[i - 1] * i) % mod
    ifact[i] = pow(fact[i], mod - 2, mod)

def ncr(n, r):
    return (fact[n] * ifact[r] * ifact[n - r]) % mod

ans = 0

for i in range(k + 1):
    ans = (ans + (m * pow(m - 1, n - i - 1, mod) * ncr(n - 1, i)) % mod) % mod

print(ans)