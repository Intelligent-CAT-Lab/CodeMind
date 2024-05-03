```python
import sys

MOD = 10**9 + 7

def pow(base, exp):
    if exp == 0:
        return 1
    ans = 1
    base %= MOD
    while exp > 0:
        if exp & 1:
            ans = (ans * base) % MOD
        base = (base * base) % MOD
        exp >>= 1
    return ans

def sub(a, b):
    c = a - b
    if c < 0:
        c += MOD
    return c

def div(a, b):
    return mul(a, pow(b, MOD - 2))

def add(a, b):
    c = a + b
    if c >= MOD:
        c %= MOD
    return c

def mul(a, b):
    c = a * b
    if c >= MOD:
        c %= MOD
    return c

def solve():
    factorial = [1] * (R2 + C2 + 11)
    for i in range(2, R2 + C2 + 11):
        factorial[i] = mul(factorial[i - 1], i)

    a = f(R2, C2, factorial)
    b = f(R2, C1 - 1, factorial)
    c = f(R1 - 1, C2, factorial)
    d = f(R1 - 1, C1 - 1, factorial)
    return add(sub(sub(a, b), c), d)

def f(r, c, factorial):
    ret = factorial[r + c + 2]
    ret = div(ret, factorial[r + 1])
    ret = div(ret, factorial[c + 1])
    ret = sub(ret, 1)
    return ret

R1, C1, R2, C2 = map(int, sys.stdin.readline().split())
print(solve())
```
