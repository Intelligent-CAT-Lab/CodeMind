class main:
    import sys
    
    a, b, n = map(int, sys.stdin.readline().split())
    
    print(n // a * b)