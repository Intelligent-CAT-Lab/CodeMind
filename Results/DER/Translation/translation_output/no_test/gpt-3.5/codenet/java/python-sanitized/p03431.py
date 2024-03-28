import sys
from math import gcd

mod = 998244353

def comb(n, k, fact, ifact):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % mod * ifact[n - k] % mod

def solve(n, k, fact, ifact):
    ans = 0
    for diff in range(k % 2, k+1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr < n:
            continue
        if diff == 0:
            ans += comb(k-1, nr, fact, ifact)
            ans -= comb(k-1, nb-1-(nr-n+1), fact, ifact)
            ans %= mod
            continue
        r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
        b2 = k - r2
        ans += comb(nr + nb, nb, fact, ifact) - comb(r2 + b2, r2, fact, ifact)
        ans %= mod

    return ans

def get_fif(max_val, mod):
    fact = [1] * max_val
    ifact = [1] * max_val
    inv = [0] * max_val
    inv[1] = 1
    for i in range(2, max_val):
        inv[i] = (mod - mod // i) * inv[mod % i] % mod
    for i in range(1, max_val):
        fact[i] = fact[i - 1] * i % mod
        ifact[i] = ifact[i - 1] * inv[i] % mod
    return fact, ifact

def main():
    fact, ifact = get_fif(500010, mod)
    
    n, k = map(int, input().split())
    print(solve(n, k, fact, ifact))

if __name__ == "__main__":
    main()