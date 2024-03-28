class main:
    import sys
    
    while True:
        try:
            a, b = map(int, sys.stdin.readline().split())
            print(a % b)
        except EOFError:
            break