import math

def solve():
    n = nl()
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
    asgn = int(math.copysign(1, a))
    bsgn = int(math.copysign(1, b))
    a = abs(a)
    b = abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
        r, s = s, r - c * s
    return [a, p * asgn, r * bsgn]

def sieve_eratosthenes(n):
    if n <= 32:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        for i in range(len(primes)):
            if n < primes[i]:
                return primes[:i]
        return primes

    u = n + 32
    lu = math.log(u)
    ret = [0] * int(u // lu + u // lu / lu *