class main:
    import sys
    
    def is_prime(n):
        for i in range(2, n):
            if n % i == 0:
                return False
        return True
    
    def main():
        n = int(input())
        while not is_prime(n):
            n += 1
        print(n)
    
    if __name__ == "__main__":
        main()