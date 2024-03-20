

```
import sys

def gcd(a, b):
    if a >= b:
        return gcd0(a, b)
    else:
        return gcd0(b, a)

def gcd0(a, b):
    if b == 0:
        return a
    else:
        return gcd0(b, a % b)

def pow(x, n, m):
    if n == 0:
        return 1
    r = pow(x, n >> 1, m)
    r = r * r % m
    if (n & 1) == 1:
        r = r * x % m
    return r

def solve(h, w, t):
    hh = h // gcd(h, t)
    ww = w // gcd(w, t)
    m = 1000000007
    way = 1
    way = (way + pow(2, hh, m) - 2) % m
    way = (way + pow(2, ww, m) - 2) % m
    way = (way + pow(2, gcd(hh, ww), m)) % m
    p = (h // hh) * (w // ww)
    way = pow(way, p, m)
    return way

h, w, t = map(int, sys.stdin.readline().split())
print(solve(h, w,
