import sys

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return (fact[n] * ifact[k] % mod * ifact[n - k] % mod)

def solve(testNumber, in, out):
    n = int(in.readline())
    k = int(in.readline())
    fact, ifact = Factorials.getFIF(500010, mod)

    ans = 0
    for diff in range(k % 2, k + 1, 2):
        nr = (k + diff) // 2
        nb = k - nr
        if nr > n:
            continue

        if diff == 0:
            ans += comb(k - 1, nr)
            if ans >= mod:
                ans -= mod
            ans -= comb(k - 1, nb - 1 - (nr - n + 1))
            if ans < 0:
                ans += mod
            continue

        r2 = (k - diff) // 2 - Math.min(k - diff, nr - n) - 1
        b2 = k - r2

        ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
        ans %= mod
        if ans < 0:
            ans += mod

    out.write(str(ans) + "\n")

def Factorials():
    fact = [1]
    ifact = [1]
    inv = [1]
    for i in range(2, 500010):
        inv[i] = (mod - mod // i) * inv[mod % i] % mod
        fact.append(fact[-1] * i % mod)
        ifact.append(ifact[-1] * inv[i] % mod)
    return fact, ifact, inv

mod = 998244353

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)