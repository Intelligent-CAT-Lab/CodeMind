import sys

mod = 998244353

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % mod * ifact[n - k] % mod

def solve():
    n, k = map(int, input().split())
    global fact, ifact
    fact = [1] * (500010)
    ifact = [1] * (500010)
    for i in range(1, 500010):
        fact[i] = fact[i - 1] * i % mod
    ifact[500010 - 1] = pow(fact[500010 - 1], mod - 2, mod)
    for i in range(500010 - 2, -1, -1):
        ifact[i] = ifact[i + 1] * (i + 1) % mod
    ans = 0
    for diff in range(k % 2, k + 1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr < n:
            continue
        if diff == 0:
            ans += comb(k - 1, nr)
            ans -= comb(k - 1, nb - 1 - (nr - n + 1))
            ans %= mod
            continue
        r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
        b2 = k - r2
        ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
        ans %= mod
    print(ans)

solve()