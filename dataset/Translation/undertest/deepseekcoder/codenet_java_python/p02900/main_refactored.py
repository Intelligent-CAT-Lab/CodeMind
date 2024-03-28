class main:
    import sys
    
    MODULO = int(1e9+7)
    
    def gcd(n, m):
        if m == 0:
            return n
        return gcd(m, n % m)
    
    def factors(n):  # returns a list of the prime factors of the number n
        fact = set()
        fact.add(1)
        i = 2
        while i * i <= n:
            while n % i == 0:
                fact.add(i)
                n //= i
            i += 1
        if n > 1:
            fact.add(n)
        return fact
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        print(len(factors(gcd(a, b))))
    
    if __name__ == "__main__":
        main()