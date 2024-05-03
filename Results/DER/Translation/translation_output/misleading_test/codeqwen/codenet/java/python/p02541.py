Here is the Python equivalent of the Java code:

```python
import sys
import math

def sieve_eratosthenes(n):
    if n <= 32:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        return primes[:min(n, len(primes))]
    
    u = n + 32
    lu = math.log(u)
    primes = [(i << 5) | (j * 0x076be629 >> 27) for i in range(u // lu + u // lu // lu * 1.5) for j in range(1, 33) if (i << 5) + j < u]
    sup = (n + 1) // 32 // 2 + 1
    isnp = [0] * sup
    
    tprimes = [3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
    for p in tprimes:
        e = 0
        while n % p == 0:
            n //= p
            e += 1
        if e > 0:
            for q in range((p * p - 3) // 2, sup):
                isnp[q] |= 1 << (q * p)
    
    for p in range(3, u, 2):
        if isnp[p // 2]:
            continue
        e = 1
        while n % p == 0:
            n //= p
            e += 1
        if e > 0:
            for q in range(p * p, sup, p):
                isnp[q // 2] |= 1 << q
    
    return [p for p in primes if isnp[p // 2]]

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    asign = -1 if a < 0 else 1
    bsign = -1 if b < 0 else 1
