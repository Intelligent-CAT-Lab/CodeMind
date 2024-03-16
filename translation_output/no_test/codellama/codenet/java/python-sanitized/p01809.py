import math

def gcd(p, q):
    while q % p != 0:
        buf = q % p
        q = p
        p = buf
    return q

def prime_factors(n):
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
    qs = q // g
    factors = prime_factors(qs)
    ans = 1
    for f in factors:
        ans *= f
    return ans

p = int(input("Enter p: "))
q = int(input("Enter q: "))
print(solve(p, q))


Next, it finds the prime factors of qs using the Sieve of Eratosthenes. It then multiplies all the prime factors together to get the final answer.