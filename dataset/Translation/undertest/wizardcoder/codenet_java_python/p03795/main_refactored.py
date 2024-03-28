class main:
    import sys
    
    n = int(sys.stdin.readline().strip())
    
    print((n * 800) - ((n // 15) * 200))