import math
import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def factors(n):
    factors = set()
    factors.add(1)
    for i in range(2, int(math.sqrt(n))+1):
        while n % i == 0:
            factors.add(i)
            n //= i
    if n > 1:
        factors.add(n)
    return factors

def main():
    a = int(input())
    b = int(input())
    print(len(factors(gcd(a,b))))

if __name__ == "__main__":
    main()