import math

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
        x = g[1]
        y = g[2]

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
    as_ = int(math.copysign(1, a))
    bs = int(math.copysign(1, b))
    a = abs(a)
    b = abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
        r, s = s, r - c * s
    return a, p * as_, r * bs

def sieve_eratosthenes(n):
    primes = []
    if n <= 32:
        base_primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
        primes.extend(p for p in base_primes if p <= n)
        return primes

    sieve = [True] * (n+1)
    for p in range(2, int(n**0.5)+1):
        if sieve[p]:
            primes.append(p)
            for i in range(p*p, n+1, p):
                sieve[i] = False

    for p in range(int(n**0.5)+1, n+1):
        if sieve[p]:
            primes.append(p)
    return primes

def enum_divisors(n, primes):
    divs = [1]
    u = n
    for p in primes:
        if p*p > u:
            break
        e = 0
        while u % p == 0:
            u //= p
            e += 1
        if e > 0:
            divs += [b * p**k for b in divs for k in range(1, e+1)]
            
    if u > 1:
        p = u
        divs += [b * p for b in divs]
    
    return divs

# Sample test case
input_number = 11
output = solve(input_number)
print(output)  # Expected output: 58