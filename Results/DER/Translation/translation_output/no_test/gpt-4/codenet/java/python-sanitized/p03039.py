import sys
from math import gcd
from functools import lru_cache

MOD = 1000000007

@lru_cache(None)
def C(n, r, mod):
    if n < 0 or r < 0 or r > n:
        return 0
    return fact(n) * inv_fact(r) % mod * inv_fact(n - r) % mod

def fact(x):
    result = 1
    for i in range(1, x + 1):
        result = result * i % MOD
    return result

def inv_fact(x):
    return pow(fact(x), MOD - 2, MOD)

def enumFIF(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    invf[n] = pow(f[n], mod - 2, mod)
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return (f, invf)

def solve(n, m, k, mod):
    fif = enumFIF(1000000, mod)
    
    xa = C(n*m-2, k-2, mod) * fif[0][k-2] % mod
    xb = sum((i * (m-i) % mod * n % mod * n % mod * 2 % mod for i in range(m))) % mod
    xc = xa * xb % mod * C(k, 2, mod) % mod
    xsum = xc * fif[1][k] % mod
    
    ya = C(n*m-2, k-2, mod) * fif[0][k-2] % mod
    yb = sum((i * (n-i) % mod * m % mod * m % mod * 2 % mod for i in range(n))) % mod
    yc = ya * yb % mod * C(k, 2, mod) % mod
    ysum = yc * fif[1][k] % mod
    
    return (xsum + ysum) % mod

def main():
    # Convert input stream according to your needs
    n, m, k = map(int, input().split())
    result = solve(n, m, k, MOD)
    print(result)

if __name__ == "__main__":
    main()