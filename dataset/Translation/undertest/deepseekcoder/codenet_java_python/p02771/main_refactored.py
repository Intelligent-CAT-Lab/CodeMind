class main:
    def p02771():
        A, B, C = map(int, input().split())
    
        if (A == B and B == C) or (A != B and A != C and B != C):
            print("No")
        else:
            print("Yes")
    
    p02771()