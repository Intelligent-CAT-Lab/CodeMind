class main:
    import sys
    
    a, b, n = map(int, sys.stdin.readline().split())
    
    if n >= b:
        print(a * (b - 1) // b)
    else:
        print(a * n // b)