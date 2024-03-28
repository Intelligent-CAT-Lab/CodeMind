class main:
    import sys
    
    n, m, d = map(int, sys.stdin.readline().split())
    
    if d == 0:
        s = n
    else:
        s = (n - d) * 2
    
    print((s / n / n * (m - 1))[1:])