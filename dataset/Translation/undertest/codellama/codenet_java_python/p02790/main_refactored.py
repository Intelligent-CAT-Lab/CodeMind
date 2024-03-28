class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    
    if a >= b:
        print(b * a)
    else:
        print(a * b)