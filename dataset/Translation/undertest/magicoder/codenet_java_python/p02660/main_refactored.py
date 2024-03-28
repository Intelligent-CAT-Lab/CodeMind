class main:
    import math
    
    def prime_factors(n):
        i = 2
        factors = {}
        while i * i <= n:
            if n % i:
                i += 1
            else:
                n //= i
                factors[i] = factors.get(i, 0) + 1
        if n > 1:
            factors[n] = factors.get(n, 0) + 1
        return factors
    
    def min_operations(n):
        if n == 1:
            return 0
        factors = prime_factors(n)
        return sum(math.ceil(count / i) for i, count in factors.items())
    
    n = int(input())
    print(min_operations(n))