class main:
    import math
    
    def solver(n):
        sqrt = int(math.sqrt(n))
        x = y = 0
        for i in range(sqrt, 0, -1):
            if n % i == 0:
                x = i
                y = n // i
                break
        
        ans = (x - 1) + (y - 1) if x != 0 and y != 0 else n - 1
        print(ans)
    
    def gcd(a, b):
        return a if b == 0 else gcd(b, a % b)
        
    def main():
        n = int(input())
        solver(n)
    
    if __name__ == "__main__":
        main()