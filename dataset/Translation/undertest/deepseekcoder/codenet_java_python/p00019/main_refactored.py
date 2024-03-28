class main:
    import sys
    
    def factorial(n):
        if n == 0:
            return 1
        else:
            return n * factorial(n-1)
    
    if __name__ == "__main__":
        n = int(sys.stdin.readline().strip())
        print(factorial(n))