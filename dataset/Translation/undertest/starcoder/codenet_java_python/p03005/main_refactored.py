class main:
    import sys
    
    n, k = map(int, sys.stdin.readline().split())
    
    if k == 1:
        print(0)
    else:
        print(n - k)