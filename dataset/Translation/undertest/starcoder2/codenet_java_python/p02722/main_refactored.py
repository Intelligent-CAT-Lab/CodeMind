class main:
    import math
    
    n = int(input())
    ans = 0
    primeFactors2 = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            primeFactors2[i] = count
    if n > 1:
        primeFactors2[n] = 1
    
    for p in primeFactors2:
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    
    a1 = 1
    for p in primeFactors2:
        a1 *= primeFactors2[p] + 1
    
    print(a1 + ans)
    
    def check(p, n):
        while n % p == 0:
            n //= p
            if n % p == 1:
                return True
        return False