class main:
    import sys
    
    h, w, x, y = map(int, sys.stdin.readline().split())
    
    if h * w % 2 == 1 and (x + y) % 2 == 1:
        print("No")
    else:
        print("Yes")