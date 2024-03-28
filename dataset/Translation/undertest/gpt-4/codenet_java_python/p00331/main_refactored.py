class main:
    import sys
    
    for line in sys.stdin:
        H, R = map(int, line.split())
    
        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)