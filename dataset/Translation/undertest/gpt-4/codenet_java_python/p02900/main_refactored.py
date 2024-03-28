class main:
    from math import gcd
    import sys
    
    def factors(n):  # returns a set of the prime factors of the number n
        fact = {1}
        for i in range(2, int(n**0.5) + 1):
            while n % i == 0:
                fact.add(i)
                n //= i
        if n > 1:
            fact.add(n)
        return fact
    
    # Accepting the two input numbers from the standard input
    numbers = list(map(int, sys.stdin.readline().strip().split()))
    a = numbers[0]
    b = numbers[1]
    
    # Calculating the size of the prime factors set of the greatest common divisor of a and b
    print(len(factors(gcd(a, b))))