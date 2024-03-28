class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    
    if a + b >= 10:
        print("error")
    else:
        print(a + b)