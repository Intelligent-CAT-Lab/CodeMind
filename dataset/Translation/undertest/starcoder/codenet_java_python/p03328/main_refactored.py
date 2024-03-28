class main:
    import sys
    
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    n = b - a
    print(n * (n + 1) / 2 - b)