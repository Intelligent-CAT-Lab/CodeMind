Here is the Python version of the provided Java code:

```python
import sys
import math

def repow(b, p):
    a = b
    res = 1
    while p > 0:
        if p % 2 == 1:
            res *= a
        a *= a
        p //= 2
    return res

def repow(b, p, modder):
    a = b % modder
    res = 1
    while p > 0:
        if p % 2 == 1:
            res = (res * a) % modder
        a = (a * a) % modder
        p //= 2
    return res

def gcd(c, d):
    while True:
        f = c % d
        if f == 0:
            return d
        c = d
        d = f

def lcm(c, d):
    return c // gcd(c, d) * d

def divList(n):
    div = []
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            div.append(i)
            if i * i != n:
                div.append(n // i)
    return div

def divSet(n):
    div = set()
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            div.add(i)
            div.add(n // i)
    return div

def pFacMap(x):
    mp = {}
    t = x
    for i in range(2, int(math.sqrt(x)) + 1):
        if t % i == 0:
            num = 0
            while t % i == 0:
                t //= i
                num += 1
            mp[i] = num
    if t != 1:
        mp[t] = 1
    return mp

def iP(n):
    if n == 2:
        return True
    if (n & 1) == 0 or n
