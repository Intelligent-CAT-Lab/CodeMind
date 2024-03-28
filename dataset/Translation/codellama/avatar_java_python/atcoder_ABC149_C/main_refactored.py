class main:
    import math
    
    def is_prime(n):
        if n <= 1:
            return False
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False
        return True
    
    def find_prime(X):
        prime = X
        mid = prime // 2
        flag = False
        while True:
            for i in range(2, mid + 1):
                if prime % i == 0:
                    flag = True
                    break
            if not flag:
                break
            else:
                flag = False
            prime += 1
        return prime
    
    X = int(input())
    prime = find_prime(X)
    print(prime)