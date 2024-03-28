class main:
    import math
    
    def solve(n):
        ans = 0
        primeFactors2 = getPrimeFactors(n - 1)
        for p in range(2, int(math.sqrt(n)) + 1):
            if p * p == n:
                ans += 1
                continue
            if n % p == 0:
                if check(p, n):
                    ans += 1
                if check(n // p, n):
                    ans += 1
        a1 = 1
        for p, count in primeFactors2.items():
            a1 *= count + 1
        return a1 + ans
    
    def check(p, n):
        while n % p == 0:
            n //= p
            if n % p == 1:
                return True
        return False
    
    def getPrimeFactors(n):
        primeFactors = {}
        c = n
        for i in range(2, int(math.sqrt(n)) + 1):
            count = 0
            while c % i == 0:
                count += 1
                c //= i
            if count > 0:
                primeFactors[i] = count
        if c > 1:
            primeFactors[c] = 1
        return primeFactors
    
    n = int(input())
    print(solve(n))