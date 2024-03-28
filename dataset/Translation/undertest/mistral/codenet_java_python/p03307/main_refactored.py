class main:
    n = int(input())
    print(problem102a(n))
    
    def problem102a(n):
        if n % 2 == 0:
            return n
        else:
            return n * 2