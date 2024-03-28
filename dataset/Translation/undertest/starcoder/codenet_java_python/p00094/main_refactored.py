class main:
    import sys
    
    while True:
        try:
            a, b = map(float, sys.stdin.readline().split())
            print(a*b/3.305785)
        except EOFError:
            break