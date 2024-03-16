```python
import sys
import math

def solve():
    n, m = map(int, sys.stdin.readline().split())
    mod = 998244353
    f = [0] * (2*n + 3)
    f[0] = f[1] = 1
    
    for i in range(2, len(f)):
        f[i] = f[i-1] + f[i-2]
        if f[i] >= mod:
            f[i] -= mod
    
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
    inv = [0] * (n + 1)
    inv[1] = 1
    
    for i in range(2, n+1):
        inv[i] = (inv[mod % i] * (mod - mod // i)) % mod
    
    return inv

def fib(n, mod):
    a = 1
    b = 1
    d = 0
    va = 1
    vb = 0
    
    for n in range(n-1, 0, -1):
        if (n & 1) == 1:
            nva = (a * va + b * vb) % mod
            nvb = (b * va + d * vb) % mod
            va = nva
            vb = nvb
        
        na = (a * a + b * b) % mod
        nb = (b * (a + d)) % mod
        nd = (d * d + b * b) % mod
        a = na
        b = nb
        d = nd
    
    return va

def main():
    solve()

if __name__ == "__main__":
    main()
```

