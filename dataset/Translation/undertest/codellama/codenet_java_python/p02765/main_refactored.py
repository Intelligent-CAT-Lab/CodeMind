class main:
    import sys
    
    n, r = map(int, sys.stdin.readline().split())
    
    if n < 10:
        print(r + (10 - n) * 100)
    else:
        print(r)