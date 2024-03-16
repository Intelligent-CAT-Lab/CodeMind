import sys
from math import gcd
from collections import defaultdict

MODULO = int(1e9+7)

def prime_factors(n):
    i = 2
    factors = set()
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.add(i)
    if n > 1:
        factors.add(n)
    return factors

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    print(len(prime_factors(gcd(a, b))))

if __name__ == "__main__":
    main()