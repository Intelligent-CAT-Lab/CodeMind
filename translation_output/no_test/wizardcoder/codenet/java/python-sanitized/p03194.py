import math

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

def prime_factors(n):
    factors = []
    i = 2
    while i <= n:
        if n % i == 0 and is_prime(i):
            factors.append(i)
            n //= i
        else:
            i += 1
    return factors

n = int(input())
p = int(input())

if n == 1:
    print(p)
else:
    factors = prime_factors(p)
    for factor in factors:
        if math.pow(factor, n) == p:
            print(factor)
            break
    else:
        print(1)