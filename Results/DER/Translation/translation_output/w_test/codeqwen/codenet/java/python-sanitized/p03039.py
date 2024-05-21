import sys

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

def enumFIF(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = (f[i - 1] * i) % mod
    a = f[n]
    b = mod
    p, q = 1, 0
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    invf[n] = p if p >= 0 else p + mod
    for i in range(n - 1, -1, -1):
        invf[i] = (invf[i + 1] * (i + 1)) % mod
    return [f, invf]

def main():
    n, m, k = map(int, sys.stdin.readline().split())
    mod = 1000000007
    fif = enumFIF(1000000, mod)

    xsum = 0
    ysum = 0

    xa = C(n*m-2,k-2,mod,fif) * fif[0][k-2] % mod
    xb = 0
    for i in range(m+1):
        tmp = (i * (m-i) % mod * n % mod * n % mod * 2 % mod)
        xb += tmp
        xb %= mod
    xc = xa * xb % mod * C(k,2,mod,fif) % mod
    xsum = xc * fif[1][k] % mod

    ya = C(n*m-2,k-2,mod