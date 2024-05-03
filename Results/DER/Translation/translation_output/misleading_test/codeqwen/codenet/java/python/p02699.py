Here is the Python version of the provided Java code:

```python
import sys

MOD = 1_000_000_007
SIZE = 1_000_000

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

def inv(a):
    return pow(a, MOD - 2)

def pow(a, r):
    sum = 1
    while r > 0:
        if r & 1 == 1:
            sum *= a
            sum %= MOD
        a *= a
        a %= MOD
        r >>= 1
    return sum

def mod_fact(n):
    if n == 0:
        return 1
    return n * mod_fact(n - 1) % MOD

def fact(n):
    if n == 0:
        return 1
    return n * fact(n - 1)

def mod_comb(n, r):
    if n < r or n < 0 or r < 0:
        return 0
    return fac[n] * finv[r] % MOD * finv[n - r] % MOD

def comb(n, r):
    num = 1
    for i in range(1, r + 1):
        num = num * (n - i + 1) // i
    return num

def is_prime(a):
    if a <= 1:
        return False
    for i in range(2, int(a**0.5) + 1):
        if a % i == 0:
            return False
    return True

def next_permutation(s):
    list_s = list(s)
    pivot_pos = -1
    pivot = 0
    for i in range(len(list_s) - 2, -1, -1):
        if list_s[i] < list_s[i+1]:
            pivot_pos = i
            pivot = list_s[i]
