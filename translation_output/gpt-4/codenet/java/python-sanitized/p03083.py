import sys
import math


MOD = 1_000_000_007


def solve():
    b = ni()
    w = ni()
    n = b + w
    dpw = [0] * (n + 1)
    dpb = [0] * (n + 1)
    fif = enum_fif(1000000, MOD)
    inv = [0] * n
    inv[1] = 1
    for i in range(2, n):
        inv[i] = inv[MOD % i] * (MOD - MOD // i) % MOD
    inv_pow = [0] * (n + 1)
    inv_pow[0] = 1
    inv_pow[1] = inv[2]
    for i in range(2, n + 1):
        inv_pow[i] = inv_pow[i - 1] * inv[2]
        inv_pow[i] %= MOD

    print(inv[2])
    for i in range(n - 1):
        dpw[i + 1] = (dpw[i] + inv[2] * C(i, w - 1, MOD, fif) % MOD * inv_pow[i] % MOD) % MOD
        dpb[i + 1] = (dpb[i] + inv[2] * C(i, b - 1, MOD, fif) % MOD * inv_pow[i] % MOD) % MOD
        ans = (MOD + (1 + dpw[i + 1] - dpb[i + 1]) % MOD) * inv[2] % MOD
        ans %= MOD
        print(ans)


def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod


def enum_fif(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
    invf[n] = p if p >= 0 else p + mod
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return [f, invf]


def ni():
    return int(sys.stdin.readline().strip())


def main():
    solve()


if __name__ == "__main__":
    main()