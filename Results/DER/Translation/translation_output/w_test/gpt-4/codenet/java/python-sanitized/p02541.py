from math import isqrt, log
import sys

def solve(n):
    if n == 1:
        return 1
    elif n == 2:
        return 3
    
    primes = sieve_eratosthenes(100000000)
    n *= 2
    divs = enum_divisors(n, primes)
    
    ret = float('inf')
    for d in divs:
        e = n // d
        g = exgcd(d, e)
        
        if g[0] != 1:
            continue
        x, y = g[1], g[2]
        
        if x < 0:
            k = d * (-x)
            ret = min(k, ret)
        if y < 0:
            k = e * (-y)
            ret = min(k, ret)
    
    return ret

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    as_, bs = int(a > 0) - int(a < 0), int(b > 0) - int(b < 0)
    a, b = abs(a), abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
        r, s = s, r - c * s
    return (a, p * as_, r * bs)

def sieve_eratosthenes(n):
    if n <= 32:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        return [p for p in primes if p < n]
    
    u = n + 32
    lu = log(u)
    ret = [2]
    
    isnp = [0] * ((n // 32 // 2) + 1)
    tprimes = [3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
    for tp in tprimes:
        ret.append(tp)
        ptn = [0] * tp
        for i in range((tp - 3) // 2, tp << 5, tp):
            ptn[i >> 5] |= 1 << i
        
        for j in range(0, len(isnp), tp):
            for i in range(tp):
                if i + j < len(isnp):
                    isnp[j + i] |= ptn[i]
    
    magic = [0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4, 13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17, 9, 6, 16, 5, 15, 14]
    h = n // 2
    pos = len(ret)
    for i in range(len(isnp)):
        for j in ~isnp[i]&0xffffffff:
            if j == 0:
                continue
            pp = i << 5 | magic[(j & -j) * 0x076be629 >> 27]
            p = 2 * pp + 3
            if p > n:
                break
            ret.append(p)
            if p**2 > n:
                continue
            for q in range((p * p - 3) // 2, h + 1, p):
                isnp[q >> 5] |= 1 << q
    
    return ret[:pos]

def enum_divisors(n, primes):
    divs = [1]
    t = 1
    u = n
    for p in primes:
        if p**2 > u:
            break
        e = 0
        while u % p == 0:
            u //= p
            e += 1
        if e > 0:
            divs += [0] * t * e
            for q in range(t - 1, -1, -1):
                b = divs[q]
                for k in range(e):
                    b *= p
                    divs[t] = b
                    t += 1
    
    if u > 1:
        p = u
        e = 1
        divs += [0] * t * e
        for q in range(t - 1, -1, -1):
            b = divs[q]
            for k in range(e):
                b *= p
                divs[t] = b
                t += 1
    
    return divs

# Sample testcase
if __name__ == '__main__':
    # For console input, use input() function.
    # n = int(input())
    n = 11
    print(solve(n))