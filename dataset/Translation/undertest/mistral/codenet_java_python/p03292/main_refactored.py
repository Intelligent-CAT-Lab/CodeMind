class main:
    T = int(input())
    R = int(input())
    Y = int(input())
    
    A = max(max(T,R),Y)
    B = min(min(T,R),Y)
    
    print(A-B)