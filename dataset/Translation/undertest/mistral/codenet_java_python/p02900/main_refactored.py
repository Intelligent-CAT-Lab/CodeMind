class main:
    import math
    
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
    
    a = int(input())
    b = int(input())
    print(len(factors(gcd(a,b))))