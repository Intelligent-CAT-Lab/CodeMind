class main:
    import math
    
    def is_prime(n):
        if n < 2:
            return False
        for i in range(2, int(math.sqrt(n))+1):
            if n % i == 0:
                return False
        return True
    
    def next_prime(n):
        while True:
            n += 1
            if is_prime(n):
                return n
    
    X = int(input())
    prime = X
    mid = prime // 2
    
    while True:
        for i in range(2, mid+1):
            if prime % i == 0:
                prime = next_prime(prime)
                break
        else:
            break
    
    print(prime)