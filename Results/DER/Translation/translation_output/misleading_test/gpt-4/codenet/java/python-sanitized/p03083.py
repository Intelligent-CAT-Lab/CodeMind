import sys
from math import factorial as fac

MOD = 10**9 + 7

def mod_inv(a, mod=MOD):
    return pow(a, mod-2, mod)

def nCr(n, r, fif, mod=MOD):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n-r] % mod

def enumFIF(n, mod=MOD):
    f = [1]*(n+1)
    invf = [1]*(n+1)
    for i in range(1, n+1):
        f[i] = f[i-1] * i % mod
    invf[n] = mod_inv(f[n], mod)
    for i in range(n-1, -1, -1):
        invf[i] = invf[i+1] * (i+1) % mod
    return f, invf

def solve(b, w):
    n = b + w
    dpw = [0]*(n+1)
    dpb = [0]*(n+1)
    fif = enumFIF(1000000, MOD)
    inv = [1]*n
    inv_pow = [1]*(n+1)
    for i in range(2, n):
        inv[i] = inv[MOD % i] * (MOD - MOD//i) % MOD
    inv_pow[1] = inv[2]
    for i in range(2, n+1):
        inv_pow[i] = inv_pow[i-1]*inv[2] % MOD
    
    print(inv[2])
    for i in range(n-1):
        dpw[i+1] = (dpw[i] + inv[2]*nCr(i, w-1, fif)*inv_pow[i] % MOD) % MOD
        dpb[i+1] = (dpb[i] + inv[2]*nCr(i, b-1, fif)*inv_pow[i] % MOD) % MOD
        ans = (MOD + (1 + dpw[i+1] - dpb[i+1]) % MOD)*inv[2] % MOD
        print(ans)

input_data = sys.stdin.readline().split()
b, w = int(input_data[0]), int(input_data[1])
solve(b, w)