class main:
    import sys
    
    def is_prime(n):
        if n <= 1:
            return False
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                return False
        return True
    
    def main():
        X = int(input())
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
    
        print(prime)
    
    if __name__ == "__main__":
        main()