import sys
import math

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = (f[i - 1] * i) % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
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
    return [f,