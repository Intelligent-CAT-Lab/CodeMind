class main:
    import sys
    
    r1, r2 = map(float, sys.stdin.readline().split())
    print(1 / (1 / r1 + 1 / r2))