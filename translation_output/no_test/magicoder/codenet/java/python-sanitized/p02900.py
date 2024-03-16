import sys
import math

MODULO = int(1e9+7)

def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)

def factors(n):
    fact = set()
    fact.add(1)
    i = 2
    while i * i <= n:
        while n % i == 0:
            fact.add(i)
            n //= i
        i += 1
    if n > 1:
        fact.add(n)
    return fact

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    print(len(factors(math.gcd(a, b))))

if __name__ == "__main__":
    main()