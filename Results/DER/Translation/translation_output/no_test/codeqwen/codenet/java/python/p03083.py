```python
import sys
import math

mod = 1_000_000_007
# mod = 998244353
inf = sys.maxsize

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

def solve():
    b = ni()
    w = ni()
    n = b + w
    dpw = [0] * (n + 1)
    dpb = [0] * (n + 1)
    fif = enumFIF(1000000, mod)
    inv = [1] * n
    inv[1] = 1
    for i in range(2, n):
        inv[i] = inv[mod % i] * (mod - mod // i) % mod
    inv_pow = [1] * (n + 1)
    inv_pow[0] = 1
    inv_pow[1] = inv[2]
    for i in range(2, n + 1):
        inv_pow[i] = inv_pow[i - 1]
