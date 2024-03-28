import math

def primeFactors(n):
    factors = {}
    i = 2
    while i <= math.sqrt(n):
        if n % i == 0:
            count = 0
            while n % i == 0:
                count += 1
                n /= i
            factors[i] = count
        i += 1
    if n > 1:
        factors[n] = 1
    return factors

def countFactors(factors):
    count = 0
    for pCount in factors.values():
        i = 1
        while pCount >= i:
            pCount -= i
            count += 1
            i += 1
    return count

n = int(input())
if n == 1:
    print(0)
else:
    factors = primeFactors(n)
    count = countFactors(factors)
    print(count)