import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def smallest_prime_factor(n):
    if n % 2 == 0:
        return 2
    sqrt_n = math.isqrt(n)
    for i in range(3, sqrt_n + 1, 2):
        if n % i == 0:
            return i
    return n

def smallest_prime_factors(n):
    factors = []
    while n % 2 == 0:
        factors.append(2)
        n //= 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            factors.append(i)
            n //= i
    if n > 2:
        factors.append(n)
    return factors

def solve(p, q):
    g = gcd(p, q)
    p //= g
    q //= g
    factors = smallest_prime_factors(q)
    factors.sort()
    factors.append(q)
    return factors[-2]

p, q = map(int, input().split())
print(solve(p, q))