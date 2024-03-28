class main:
    def p03292():
        T, R, Y = map(int, input().split())
    
        A = max(max(T,R),Y)
        B = min(min(T,R),Y)
    
        print(A-B)
    
    p03292()