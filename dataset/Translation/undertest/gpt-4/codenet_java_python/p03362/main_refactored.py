class main:
    import math
    
    def is_prime(n):
        for i in range(2, math.isqrt(n) + 1):
            if n % i == 0:
                return False
        return True
    
    def main():
        N = int(input())
    
        count = 0
        for i in range(6, 55556, 5):
            if is_prime(i):
                print(f"{i} ", end="")
                count += 1
            if count == N:
                break
    
    if __name__ == "__main__":
        main()