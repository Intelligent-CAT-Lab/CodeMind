import sys
from math import comb

MOD = 998244353

def getFIF(max_n, mod):
    fact, ifact, inv = [1] * max_n, [1] * max_n, [1] * max_n
    for i in range(2, max_n):
        inv[i] = (mod - mod // i) * inv[mod % i] % mod
    for i in range(1, max_n):
        fact[i] = fact[i - 1] * i % mod
        ifact[i] = ifact[i - 1] * inv[i] % mod
    return fact, ifact, inv

def TaskE(n, k):
    ans = 0
    x = getFIF(500010, MOD)
    fact, ifact = x[0], x[1]

    def comb_mod(n, k):
        if k < 0 or k > n:
            return 0
        return fact[n] * ifact[k] % MOD * ifact[n - k] % MOD

    for diff in range(k % 2, k + 1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr < n:
            continue

        if diff == 0:
            ans += comb_mod(k - 1, nr)
            if ans >= MOD:
                ans -= MOD
            ans -= comb_mod(k - 1, nb - 1 - (nr - n + 1))
            if ans < 0:
                ans += MOD
            continue

        r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
        b2 = k - r2

        ans += comb_mod(nr + nb, nb) - comb_mod(r2 + b2, r2)
        ans %= MOD
        if ans < 0:
            ans += MOD

    return ans

def main():
    n, k = map(int, input().split())
    print(TaskE(n, k))

if __name__ == "__main__":
    main()