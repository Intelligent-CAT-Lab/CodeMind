class main:
    import sys
    
    X, Y = map(int, sys.stdin.readline().split())
    if X%2==0 or Y%2==0:
        print("Even")
    else:
        print("Odd")