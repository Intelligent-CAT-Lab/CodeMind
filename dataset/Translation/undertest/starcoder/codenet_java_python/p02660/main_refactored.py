class main:
    import math
    
    def get_prime_factors(n):
        factors = {}
        i = 2
        while i <= math.sqrt(n):
            if n % i == 0:
                factors[i] = 0
                while n % i == 0:
                    n /= i
                    factors[i] += 1
            i += 1
        if n > 1:
            factors[n] = 1
        return factors
    
    def get_number_of_divisors(factors):
        ans = 1
        for p, pCount in factors.items():
            i = 1
            while pCount >= i:
                pCount -= i
                ans += 1
                i += 1
        return ans
    
    n = int(input())
    if n == 1:
        print(0)
    else:
        factors = get_prime_factors(n)
        print(get_number_of_divisors(factors))