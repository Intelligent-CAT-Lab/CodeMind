import math

MODULO = 1000000007

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def factors(n):
    fact = set()
    fact.add(1)
    for i in range(2, int(math.sqrt(n)) + 1):
        while n % i == 0:
            fact.add(i)
            n /= i
    if n > 1:
        fact.add(n)
    return fact

def main():
    a = int(input())
    b = int(input())
    print(len(factors(gcd(a, b))))

if __name__ == '__main__':
    main()