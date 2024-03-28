class main:
    def is_prime(n):
        mid = n // 2
        for i in range(2, mid + 1):
            if n % i == 0:
                return False
        return True
    
    def next_prime(n):
        prime = n
        while True:
            if is_prime(prime):
                return prime
            prime += 1
    
    X = int(input())
    print(next_prime(X))