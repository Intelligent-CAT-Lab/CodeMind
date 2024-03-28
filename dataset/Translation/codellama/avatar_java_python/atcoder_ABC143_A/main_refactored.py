class main:
    import sys
    
    A, B = map(int, sys.stdin.readline().split())
    
    if A - (B * 2) > 0:
        print(A - (B * 2))