import math

def get_prime_factors(n):
    prime_factors = {}
    while n % 2 == 0:
        prime_factors[2] = prime_factors.get(2, 0) + 1
        n //= 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            prime_factors[i] = prime_factors.get(i, 0) + 1
            n //= i
    if n > 2:
        prime_factors[n] = prime_factors.get(n, 0) + 1
    return prime_factors

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def solve():
    n = int(input())
    ans = 0
    prime_factors = get_prime_factors(n - 1)
    for p in prime_factors:
        ans *= prime_factors[p] + 1
    for p in range(2, int(math.sqrt(n)) + 1):
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    if int(math.sqrt(n)) ** 2 == n:
        ans += 1
    print(ans + 1)

solve()