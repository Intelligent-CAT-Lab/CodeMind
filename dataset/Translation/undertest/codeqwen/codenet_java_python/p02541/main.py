import sys
import math

def sieve_eratosthenes(n):
    if n <= 32:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        return primes[:min(n, len(primes))]
    
    u = n + 32
    lu = math.log(u)
    ret = [1]
    pos = 1
    
    isnp = [0] * ((n + 1) // 32 // 2 + 1)
    sup = (n + 1) // 32 // 2 + 1
    
    tprimes = [3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
    for p in tprimes:
        if p * p > u:
            break
        e = 0
        while u % p == 0:
            u //= p
            e += 1
        if e > 0:
            ret.extend([p**i for i in range(e + 1)])
            for q in range((p * p - 3) // 2, sup):
                isnp[q >> 5] |= 1 << q
            m = e + 1
    
    if u > 1:
        p = u
        e = 1
        ret.extend([p**i for i in range(e + 1)])
        for q in range((p * p - 3) // 2, sup):
            isnp[q >> 5] |= 1 << q
        m = e + 1
    
    return ret

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    asign = 1 if a > 0 else -1
    bsign = 1 if b > 0 else -1
    a = abs(a)
    b = abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b