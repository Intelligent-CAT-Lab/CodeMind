import math

mod = 998244353

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % mod * ifact[n - k] % mod

n, k = map(int, input().split())
fact = [1] * (500010)
ifact = [1] * (500010)
inv = [1] * (500010)
inv[1] = 1
for i in range(2, 500010):
    inv[i] = (mod - mod // i) * inv[mod % i] % mod
for i in range(1, 500010):
    fact[i] = fact[i - 1] * i % mod
    ifact[i] = ifact[i - 1] * inv[i] % mod

ans = 0
for diff in range(k % 2, k + 1, 2):
    nr = (k + diff) // 2
    nb = k - nr
    if nr < n:
        continue
    if diff == 0:
        ans += comb(k-1, nr)
        if ans >= mod:
            ans -= mod
        ans -= comb(k-1, nb-1-(nr-n+1))
        if ans < 0:
            ans += mod
        continue
    r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
    b2 = k - r2
    ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
    ans %= mod
    if ans < 0:
        ans += mod

print(ans)

/content/post/codeforces/701/701-C.md
---
title: "701 C.