import sys

MOD = 998244353

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % MOD * ifact[n - k] % MOD

def solve(n, k):
    ans = 0
    for diff in range(k % 2, k + 1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr < n:
            continue
        if diff == 0:
            ans += comb(k-1, nr)
            ans %= MOD
            ans -= comb(k-1, nb-1-(nr-n+1))
            ans %= MOD
            continue
        r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
        b2 = k - r2
        ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
        ans %= MOD
    return ans

def main():
    n, k = map(int, sys.stdin.readline().split())
    fact, ifact = Factorials.getFIF(500010, MOD)
    print(solve(n, k))

if __name__ == "__main__":
    main()

class Factorials:
    @staticmethod
    def getFIF(max, mod):
        fact = [1] * max
        ifact = [1] * max
        inv = [1] * max
        inv[1] = 1
        for i in range(2, max):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod
        for i in range(1, max):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * inv[i] % mod
        return fact, ifact