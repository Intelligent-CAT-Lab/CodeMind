class main:
    def problem102a(n):
        return n * 2 if n % 2 != 0 else n
    
    n = int(input())
    print(problem102a(n))