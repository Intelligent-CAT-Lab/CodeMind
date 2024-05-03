Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    n = int(input()) - 1
    m = int(input())
    mod = 998244353
    f = [1] * (2 * n + 3)
    for i in range(2, len(f)):
        f[i] = (f[i-1] + f[i-2]) % mod
    prod = 1
    s = 0
    invs = enum_invs(n+1, mod)
    for i in range(n-1, -1, -1):
        s += f[2*i+1] * prod
        s %= mod
        prod = prod * ((m+n-i-1) % mod) % mod * invs[n-i] % mod
    ret = fib(m+2*n, mod) - s
    ret %= mod
    if ret < 0:
        ret += mod
    print(ret)

def enum_invs(n, mod):
    inv = [1] * (n + 1)
    inv[1] = 1
    for i in range(2, n + 1):
        inv[i] = (inv[mod % i] * (mod - mod // i)) % mod
    return inv

def fib(n, mod):
    a, b, d = 1, 1, 0
    va, vb = 1, 0
    while n > 0:
        if n & 1:
            va, vb = (a * va + b * vb) % mod, (b * va + d * vb) % mod
        a, b, d = (a * a + b * b) % mod, (b * (a + d)) % mod, (d * d + b * b) % mod
        n >>= 1
    return va

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the result, and prints it to the standard output. The `solve` function is the
