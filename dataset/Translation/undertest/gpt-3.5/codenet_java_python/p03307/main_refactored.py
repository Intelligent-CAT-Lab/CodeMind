class main:
    def problem102a(n):
        return n if n % 2 == 0 else n * 2
    
    if __name__ == "__main__":
        n = int(input())
        print(problem102a(n))