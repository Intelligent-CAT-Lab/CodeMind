class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    print(max(0, a - 2 * b))