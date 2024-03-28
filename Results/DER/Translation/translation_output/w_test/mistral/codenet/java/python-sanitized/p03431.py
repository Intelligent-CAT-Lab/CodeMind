import sys

def comb(n, k):
    if k < 0 or k > n:
        return 0
    fact, ifact = [1] * (n + 1), [1] * (n + 1)
    for i in range(2, n + 1):
        fact[i] = fact[i - 1] * i
        ifact[i] = ifact[i - 1] * (n - i + 1)
    ans = fact[n] * ifact[k] % 998244353 * ifact[n - k] % 998244353
    return ans % 998244353

def solve(test_number, in, out):
    n, k = map(int, in.readline().strip().split())
    fact, ifact = [1] * (n + 1), [1] * (n + 1)
    for i in range(2, n + 1):
        fact[i] = fact[i - 1] * i
        ifact[i] = ifact[i - 1] * (n - i + 1)
    ans = 0
    for diff in range(k % 2, k + 1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr > n:
            continue
        if diff == 0:
            ans += comb(n - 1, nr)
            ans %= 998244353
            ans -= comb(n - 1, nb - 1 - (nr - n + 1))
            ans %= 998244353
            continue
        r2 = (k - diff) // 2 - math.min(k - diff, nr - n) - 1
        b2 = k - r2
        ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
        ans %=