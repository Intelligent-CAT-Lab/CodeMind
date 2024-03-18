```python
import math

def solve():
    n = int(input())
    if n == 1:
        print(1)
        return
    elif n == 2:
        print(3)
        return
    
    primes = sieve_eratosthenes(100000000)
    n *= 2
    divs = enum_divisors(n, primes)

    ret = float('inf')
    for d in divs:
        e = n // d
        g = exgcd(d, e)

        if g[0] != 1:
            continue

        x = g[1]
        y = g[2]

        if x < 0:
            k = d * (-x)
            ret = min(k, ret)

        if y < 0:
            k = e * (-y)
            ret = min(k, ret)

    print(ret)

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    as_ = math.copysign(1, a)
    bs = math.copysign(1, b)
    a = abs(a)
    b = abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
        d = r
        r = s
        s = d - c * s
    return [a, p * as_, r * bs]

def sieve_eratosthenes(n):
    if n <= 32:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        for i in range(len(primes)):
            if n < primes[i]:
                return primes[:i]
        return primes

    u = n + 32
    lu = math.log(u)
    ret = [0] * int(u / lu + u / lu / lu * 1.5)
    ret[0] = 2
    pos = 1

    isnp = [0] * ((n + 1) // 32 // 2 + 1)
    sup = (n + 1) // 32 // 2 + 1

    tprimes = [3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
    for tp in tprimes:
        ret[pos] = tp
        pos += 1
        ptn = [0] * tp
        for i in range((tp - 3) // 2, tp << 5, tp):
            ptn[i >> 5] |= 1 << i
        for j in range(0, sup, tp):
            for i in range(tp):
                if i + j < sup:
                    isnp[j + i] |= ptn[i]

    magic = [0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4, 13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17, 9, 6, 16, 5, 15, 14]
    h = n // 2
    for i in range(sup):
        j = ~isnp[i]
        while j != 0:
            pp = i << 5 | magic[(j & -j) * 0x076be629 >> 27]
            p = 2 * pp + 3
            if p > n:
                break
            ret[pos] = p
            pos += 1
            if p * p > n:
                continue
            for q in range((p * p - 3) // 2, h, p):
                isnp[q >> 5] |= 1 << q

    return ret[:pos]

def enum_divisors(n, primes):
    m = 1
    divs = [1]
    t = 1
    u = n
    for p in primes:
        if p * p > u:
            break
        
        e = 0
        while u % p == 0:
            u //= p
            e += 1
        
        if e > 0:
            divs += [0] * (t * (e + 1))
            for q in range(t - 1, -1, -1):
                b = divs[q]
                for k in range(e):
                    b *= p
                    divs[t] = b
                    t += 1
            m *= e + 1
    
    if u > 1:
        p = u
        e = 1
        divs += [0] * (t * (e + 1))
        for q in range(t - 1, -1, -1):
            b = divs[q]
            for k in range(e):
                b *= p
                divs[t] = b
                t += 1
        m *= e + 1

    return divs[:t]

solve()
```
