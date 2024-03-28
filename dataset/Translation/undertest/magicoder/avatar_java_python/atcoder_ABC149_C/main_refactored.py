class main:
    def is_prime(n):
        if n == 2 or n == 3: return True
        if n < 2 or n%2 == 0: return False
        if n < 9: return True
        if n%3 == 0: return False
        r = int(n**0.5)
        f = 5
        while f <= r:
            if n%f == 0: return False
            if n%(f+2) == 0: return False
            f +=6
        return True
    
    def next_prime(n):
        while True:
            n += 1
            if is_prime(n):
                return n
    
    X = int(input())
    print(next_prime(X))