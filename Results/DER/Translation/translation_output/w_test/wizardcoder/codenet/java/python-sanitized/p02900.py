MODULO = 1000000007

def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)

def factors(n):
    fact = set()
    fact.add(1)
    for i in range(2, int(n**0.5)+1):
        while n % i == 0:
            fact.add(i)
            n //= i
    if n > 1:
        fact.add(n)
    return fact

def main():
    a, b = map(int, input().split())
    print(len(factors(gcd(a, b))))

if __name__ == '__main__':
    main()