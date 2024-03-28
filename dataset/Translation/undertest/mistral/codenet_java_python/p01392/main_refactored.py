class main:
    import math
    
    def primes(n):
        primes = []
        sieve = [True] * (n+1)
        for i in range(2, int(math.sqrt(n)+1)+1):
            if sieve[i]:
                primes.append(i)
                for j in range(i*2, n+1, i):
                    sieve[j] = False
        return primes
    
    def count_divisors(n, primes):
        count = [0] * (n-l+1)
        for p in primes:
            l = math.ceil(n/p)
            for i in range(l*p, n+1, p):
                count[i-l] += 1
        return count
    
    L, H = map(int, input().split())
    primes = primes(int(math.sqrt(H)+1))
    count = count_divisors(L, primes)
    ans = sum(1 for i in range(len(count)) if count[i] > 1)
    print(ans)