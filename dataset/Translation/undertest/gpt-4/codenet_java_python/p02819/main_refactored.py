class main:
    def is_prime(x):
        for i in range(2, x):
            if x % i == 0:
                return False
        return True
    
    def next_prime(x):
        while not is_prime(x):
            x += 1
        return x
    
    # Sample test case
    x = int(input())
    print(next_prime(x))