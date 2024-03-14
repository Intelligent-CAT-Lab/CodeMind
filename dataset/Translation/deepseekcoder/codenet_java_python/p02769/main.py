import sys
from functools import reduce

mod = 1000000007

def gen(n):
    fact = [1]*(n+1)
    factinv = [1]*(n+1)
    for i in range(1, n+1):
        fact[i] = i * fact[i - 1] % mod
        factinv[i] = pow(fact[i], mod - 2, mod)
    return fact, factinv

def nCrs(n, r, p):
    if r > n:
        return 0
    return fact[n] * factinv[r] % p * factinv[n - r] % p

def power(x, y, p):
    res = 1
    x = x % p
    while (y > 0):
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res

def solve(n, k):
    if k >= n:
        return nCrs(n + n - 1, n - 1, mod)
    else:
        ans = 0
        fact, factinv = gen(n)
        for i in range(k+1):
            up = fact[n] * fact[n - 1] % mod
            den1 = factinv[i] * factinv[i] % mod
            den2 = factinv[n - i] * factinv[n - i - 1] % mod
            den = den1 * den2 % mod
            ans += up * den % mod
            ans %= mod
        return ans

fact, factinv = gen(100000)
for line in sys.stdin:
    n, k = map(int, line.split())
    print(solve(n, k))