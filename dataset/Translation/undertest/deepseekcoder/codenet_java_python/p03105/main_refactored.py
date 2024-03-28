class main:
    def p03105():
        A, B, C = map(int, input().split())
        N = B // A
        if N > C:
            print(C)
        else:
            print(N)
    
    p03105()