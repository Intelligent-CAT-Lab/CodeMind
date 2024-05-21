import math

def get_prime_factors(n):
    prime_factors = {}
    while n % 2 == 0:
        if 2 not in prime_factors:
            prime_factors[2] = 0
        prime_factors[2] += 1
        n //= 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            if i not in prime_factors:
                prime_factors[i] = 0
            prime_factors[i] += 1
            n //= i
    if n > 2:
        prime_factors[n] = 1
    return prime_factors

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def solve(n):
    prime_factors = get_prime_factors(n - 1)
    ans = 1
    for p, e in prime_factors.items():
        ans *= e + 1
    for p in range(2, int(math.sqrt(n)) + 1):
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    return ans

n = int(input())
print(solve(n))