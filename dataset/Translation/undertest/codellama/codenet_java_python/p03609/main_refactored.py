class main:
    import sys
    
    x, t = map(int, sys.stdin.readline().split())
    
    if x > t:
        print(x - t)
    else:
        print(0)