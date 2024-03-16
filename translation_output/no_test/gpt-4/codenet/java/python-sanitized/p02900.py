import math
import sys

MODULO = 10**9 + 7

def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)

def factors(n):  # returns a set of the prime factors of the number n
    fact = set()
    fact.add(1)
    for i in range(2, int(math.isqrt(n)) + 1):
        while n % i == 0:
            fact.add(i)
            n //= i
    if n > 1:
        fact.add(n)
    return fact

def main():
    # Assuming input is to be taken from stdin as per the FastReader class
    a = int(input().strip())
    b = int(input().strip())
    print(len(factors(gcd(a, b))))

if __name__ == '__main__':
    main()