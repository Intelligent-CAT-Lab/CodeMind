import sys
from math import factorial

def C(n, r, mod):
    if n < 0 or r < 0 or r > n:
        return 0
    return (factorial(n) // (factorial(r) * factorial(n - r))) % mod

def enumFIF(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod

    a, b, p, q = f[n], mod, 1, 0
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    invf[n] = p + mod if p < 0 else p

    for i in range(n - 1, -1, -1):
        invf[i] = (invf[i + 1] * (i + 1)) % mod

    return [f, invf]

def solve():
    n, m, k = map(int, input().split())
    mod = 1000000007
    fif = enumFIF(1000000, mod)

    xsum = 0
    ysum = 0

    xa = C(n*m-2, k-2, mod) * fif[0][k-2] % mod
    xb = 0
    for i in range(m):
        tmp = (i * (m-i) % mod * n % mod * n % mod * 2) % mod
        xb += tmp
        xb %= mod
    xc = xa * xb % mod * C(k, 2, mod) % mod
    xsum = xc * fif[1][k] % mod

    ya = C(n*m-2, k-2, mod) * fif[0][k-2] % mod
    yb = 0
    for i in range(n):
        tmp = (i * (n-i) % mod * m % mod * m % mod * 2) % mod
        yb += tmp
        yb %= mod
    yc = ya * yb % mod * C(k, 2, mod) % mod
    ysum = yc * fif[1][k] % mod

    print((xsum+ysum)%mod)

if __name__ == "__main__":
    solve()