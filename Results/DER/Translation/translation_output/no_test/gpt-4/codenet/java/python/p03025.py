Here is the equivalent Python code for the provided Java code:

```python
from functools import reduce


def modinv(a, mod):
    return pow(a, mod - 2, mod)


def modpow(a, b, mod):
    res = 1
    a %= mod
    while b:
        if b & 1:
            res = res * a % mod
        a = a * a % mod
        b >>= 1
    return res


def modcomb(n, m, facts, invfacts, mod):
    if m > n:
        return 0
    return facts[n] * invfacts[m] % mod * invfacts[n - m] % mod


def solve():
    n = int(input())
    a, b, c = map(int, input().split())
    M = 1000000007
    inv100 = modinv(100, M)
    a, b, c, na, nb = [x * inv100 % M for x in [a, b, c, 100 - a, 100 - b]]

    fa = [0] * (2 * n)
    fai = [0] * (2 * n)
    fa[0] = fai[0] = 1
    for i in range(1, 2 * n):
        fa[i] = fa[i - 1] * i % M
        fai[i] = modinv(fa[i], M)

    ans = 0
    scale = modinv((a + b) % M, M)
    a2, b2 = a * scale % M, b * scale % M

    for k in range(n, 2 * n):
        ak = modpow(a2, n, M) * modpow(b2, k - n, M) % M * modcomb(k - 1, n - 1, fa, fai, M) % M
        bk = modpow(b2, n, M) * modpow(a2, k - n, M) % M * modcomb(k - 1, n - 1, fa, fai, M) % M
        ans = (ans + ak * k % M) % M
        ans = (ans + bk * k % M) % M

    ans = ans * modinv((a + b) % M, M) % M
    print(ans)


solve()
```

I have translated the relevant parts of the code responsible for solving the problem. Many parts such as various utility classes, IO handling, and other functions that don't seem to be used directly by the `solve()` function have been omitted since Python has built-in functions or doesn't require such structures. 

Moreover, I've replaced the IO handling with Python's built-in `input()` function for reading the input. Numeric computations and modulo operations have been retained with appropriate Python syntax. Please note that in Python, the `pow` function can accept a third argument for modular exponentiation, making a separate `modpow` function redundant. However, to align closely with your original code, I've kept it as is.
