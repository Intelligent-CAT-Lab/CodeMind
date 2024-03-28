class main:
    import sys
    
    n, a, b, c = map(int, sys.stdin.readline().split())
    print(n - a - b + c)